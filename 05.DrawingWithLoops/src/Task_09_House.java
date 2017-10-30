import java.util.Scanner;

public class Task_09_House {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = Integer.parseInt(sc.nextLine());

        // roof
        int roof = (n + 1) / 2;
        int stars = 0;

        if (n % 2 != 0) {
            stars = 1;
        } else {
            stars = 2;
        }
        int spaces = (n - stars) / 2;
        for (int row = 0; row < roof; row++) {
            for (int i = 0; i < spaces; i++) {
                System.out.print("-");
            }

            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }

            for (int i = 0; i < spaces; i++) {
                System.out.print("-");
            }
            System.out.println();
            stars += 2;
            spaces = (n - stars) / 2;
        }

        //foundation of the house
        int rows = n / 2;
        stars = n - 2;
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
