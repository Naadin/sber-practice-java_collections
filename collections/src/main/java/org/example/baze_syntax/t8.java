package org.example.baze_syntax;
import java.util.ArrayList;
import java.util.List;

public class t8 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();

        // Заполнение списка случайными числами
        for (int i = 0; i < 30; i++) {
            array.add((int) (Math.random() * 1001));
        }

        System.out.println("Массив: " + array);

        // Сортировка пузырьком
        for (int i = array.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }

        System.out.println("        Сортировка методом пузырька...");
        System.out.println("Отсортированный массив: " + array);
    }
}
