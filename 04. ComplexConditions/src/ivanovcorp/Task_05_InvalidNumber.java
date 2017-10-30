package ivanovcorp;

import java.util.Scanner;

public class Task_05_InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        if ((num >= 100 && num <= 200) || num ==0) {

        } else {
            System.out.println("invalid");
        }
    }
}
