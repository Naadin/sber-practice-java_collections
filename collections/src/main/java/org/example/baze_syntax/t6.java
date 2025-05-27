package org.example.baze_syntax;
import java.util.ArrayList;

public class t6 {
    private static final int size = 100;
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(size);

        // Заполнение списка случайными числами
        for (int i = 0; i < size; ++i) {
            array.add((int) (Math.random() * 1001));
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        double sum = 0.0;

        // Поиск максимума и суммы с помощью foreach
        int currentIndex = 0;
        for (int value : array) {
            if (value > max) {
                max = value;
                maxIndex = currentIndex;
            }
            sum += value;
            currentIndex++;
        }

        double average = sum / size;

        System.out.println("Массив: " + array);
        System.out.println("Максимальное значение = [" + max + "], находится в элементе под индексом = [" + maxIndex + "].");
        System.out.println("Среднее значение = [" + average + "].");
    }
}
