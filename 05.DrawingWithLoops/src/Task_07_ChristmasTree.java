import java.util.Scanner;

public class Task_07_ChristmasTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int space = n;
        int star = 0;



        for (int row = 0; row <= n; row++) {
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }

            System.out.print(" | ");

            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }

            System.out.println();
            star++;
            space--;
        }
    }
}
