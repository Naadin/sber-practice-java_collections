package org.example;
import java.util.*;

public class Мар {
    public static void main(String[] args) {
        Map<Long, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put(89217255054L, "Сидоров Агафон Никанорович");
        phoneBook.put(89535720971L, "Петров Петр Петрович");
        phoneBook.put(89113315675L, "Иванов Иван Иванович");

        Map<Long, String> randomOrder = new HashMap<>(phoneBook);
        System.out.println("1. Записи в случайном порядке:");
        for (Map.Entry<Long, String> entry : randomOrder.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();

        Map<Long, String> sortedByPhone = new TreeMap<>(phoneBook);
        System.out.println("2. Записи по возрастанию номера телефона:");
        for (Map.Entry<Long, String> entry : sortedByPhone.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();

        System.out.println("3. Записи в порядке добавления:");
        for (Map.Entry<Long, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();

        List<Map.Entry<Long, String>> entries = new ArrayList<>(phoneBook.entrySet());
        entries.sort(Comparator.comparing(Map.Entry::getValue, String.CASE_INSENSITIVE_ORDER));

        System.out.println("4. Записи, отсортированные по ФИО:");
        for (Map.Entry<Long, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
