package org.example.baze_syntax;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class t5 {
    public static void main(String[] args) {
        System.out.println("          Последовательность Фибоначчи");
        System.out.println("Вывод на экран первых n членов последовательности");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n = ");
        int n = scanner.nextInt();

        if (n < 2 || n > 100) {
            System.out.println("Допустимые значения n - от 2 до 100");
            return;
        }

        // Используем список для хранения последовательности
        List<Integer> fibSequence = new ArrayList<>();

        // Заполняем список итеративно (рекурсия неэффективна для больших n)
        fibSequence.add(0); // F0
        fibSequence.add(1); // F1

        for (int i = 2; i < n; i++) {
            int next = fibSequence.get(i - 1) + fibSequence.get(i - 2);
            fibSequence.add(next);
        }

        System.out.println("Первые " + n + " членов последовательности: ");
        // Выводим с помощью foreach
        for (int num : fibSequence) {
            System.out.print(num + " ");
        }
    }
}
