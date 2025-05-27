package org.example.baze_syntax;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class t10 {
    public static void main(String[] args) {
        System.out.print("Введите ваше имя: ");
        String name = new Scanner(System.in).nextLine();

        JOptionPane.showMessageDialog(null, "Привет, " + name);
    }
}
