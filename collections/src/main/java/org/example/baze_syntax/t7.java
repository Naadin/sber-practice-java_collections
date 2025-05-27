package org.example.baze_syntax;
import java.util.Scanner;

public class t7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double epsilon = 1e-10;

        System.out.println("Решение квадратного уравнения вида: ax^2 + bx + c = 0");
        System.out.print("Введите значение a = ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b = ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение c = ");
        double c = scanner.nextDouble();

        if (Math.abs(a) < epsilon) {
            // Линейное уравнение bx + c = 0
            if (Math.abs(b) < epsilon) {
                if (Math.abs(c) < epsilon) {
                    System.out.println("Уравнение имеет бесконечное множество решений.");
                } else {
                    System.out.println("Уравнение не имеет решений.");
                }
            } else {
                double root = -c / b;
                System.out.println("Линейное уравнение, корень: x = " + root);
            }
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > epsilon) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Корни уравнения:");
                System.out.println("x1 = " + root1);
                System.out.println("x2 = " + root2);
            } else if (Math.abs(discriminant) < epsilon) {
                double root = -b / (2 * a);
                System.out.println("Уравнение имеет единственный корень:");
                System.out.println("x = " + root);
            } else {
                System.out.println("Уравнение не имеет действительных корней.");
            }
        }

        scanner.close();
    }
}
