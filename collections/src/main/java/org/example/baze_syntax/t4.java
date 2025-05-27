package org.example.baze_syntax;
import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        System.out.println("Является ли число простым?");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Число должно быть больше нуля.");
        } else {
            boolean primeNum = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primeNum = false;
                    break;
                }
            }
            System.out.println(primeNum ? "Да" : "Нет");
        }
    }
}
