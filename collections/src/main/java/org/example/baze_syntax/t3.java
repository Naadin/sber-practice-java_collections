package org.example.baze_syntax;
import java.util.Arrays;
import java.util.List;

public class t3 {
    public static void main(String[] args) {
        List<Integer> starsPerRow = Arrays.asList(10, 9, 10, 9, 10, 9);
        int rowIndex = 0;
        for (Integer starsCount : starsPerRow) {
            if (rowIndex % 2 != 0) {
                System.out.print(" ");
            }
            printStar(starsCount);
            System.out.println();
            rowIndex++;
        }
    }

    private static void printStar(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
    }
}
