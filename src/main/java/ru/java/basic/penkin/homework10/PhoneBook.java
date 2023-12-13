package ru.java.basic.penkin.homework10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {        // в гитхаб vetka1
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new HashSet<>());
        }
        phoneBook.get(name).add(phone);
    }

    public Set<String> find(String name) {
        return phoneBook.getOrDefault(name, new HashSet<>());
    }

    public boolean containsPhoneNumber(String phone) {
        for (Set<String> phones : phoneBook.values()) {
            if (phones.contains(phone)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        System.out.println("--------------------------------------------------------------");
        phoneBook.add("Харитонов Евгений Евгеньевич", "89325778568");
        phoneBook.add("Громов Роман Романович", "89324258895");
        phoneBook.add("Александров Дмитрий Дмитриевич", "89632245576");
        phoneBook.add("Копылов Павел Павлович", "89154548858");
        phoneBook.add("Прохоров Сергей Сергеевич", "89154545442");
        phoneBook.add("Александров Дмитрий Дмитриевич", "89654845484");
        phoneBook.add("Прохоров Сергей Сергеевич", "89256987788");
        phoneBook.add("Гордеев Василий Васильевич", "89659745451");
        phoneBook.add("Александров Дмитрий Дмитриевич", "89658784841");
        phoneBook.add("Александров Дмитрий Дмитриевич", "89789945988");
        phoneBook.add("Филиппов Леонид Леонидович", "89878788456");

        System.out.println("Найденные в справочнике телефонные номера Александров Дмитрий Дмитриевич: " + phoneBook.find("Александров Дмитрий Дмитриевич"));
        System.out.println("Найденные в справочнике телефонные номера Прохоров Сергей Сергеевич: " + phoneBook.find("Прохоров Сергей Сергеевич"));
        System.out.println("Найденные в справочнике телефонные номера Гордеев Василий Васильевич: " + phoneBook.find("Гордеев Василий Васильевич"));

        System.out.println("--------------------------------------------------------------");
        System.out.println("Наличие телефонного номера в справочнике 89324258895: " + phoneBook.containsPhoneNumber("89324258895"));
        System.out.println("Наличие телефонного номера в справочнике 12345678910: " + phoneBook.containsPhoneNumber("12345678910"));
        System.out.println("Наличие телефонного номера в справочнике 12121212121: " + phoneBook.containsPhoneNumber("12121212121"));
        System.out.println("Наличие телефонного номера в справочнике 89632245576: " + phoneBook.containsPhoneNumber("89632245576"));
        System.out.println("Наличие телефонного номера в справочнике 89154545442: " + phoneBook.containsPhoneNumber("89154545442"));
        System.out.println("--------------------------------------------------------------");
    }
}