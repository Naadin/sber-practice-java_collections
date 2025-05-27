package org.example.baze_syntax;
import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Введите ваше имя: ");
        String name = new Scanner(System.in).next();
        System.out.println("Hello, " + name + "!");
    }
}
