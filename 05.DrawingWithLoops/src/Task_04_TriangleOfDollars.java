import java.util.Scanner;

public class Task_04_TriangleOfDollars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String ch = "$";

        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
