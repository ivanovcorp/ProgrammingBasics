package Task_06_SquareOFStars;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        printTopOrBottom(n);
        for (int rows = n - 2; rows > 0; rows--) {
            System.out.print("*");
            for (int spaces = n - 2; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        printTopOrBottom(n);
    }

    public static void printTopOrBottom(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
