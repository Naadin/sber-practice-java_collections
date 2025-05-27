package org.example.baze_syntax;
import java.util.Random;
import java.util.Scanner;

public class t9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = (char) (new Random().nextInt('z' - 'a' + 1) + 'a');

        while (true) {
            System.out.print("Введите букву: ");
            char c = scanner.next().toLowerCase().charAt(0);

            if (c < 'a' || c > 'z') {
                System.out.println("Введен недопустимый символ.");
            } else if (c == ch) {
                System.out.println("Верно!");
                break;
            } else {
                System.out.println(ch < c ?
                        "Ищи букву, которая перед ней в алфавите" :
                        "Ищи букву, которая после нее в алфавите");
            }
        }

        scanner.close();
    }
}
