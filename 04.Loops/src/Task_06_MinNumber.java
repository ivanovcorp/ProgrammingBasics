import java.util.Scanner;

public class Task_06_MinNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currNum = Integer.parseInt(sc.nextLine());
            if (currNum < smallest) {
                smallest = currNum;
            }
        }

        System.out.println(smallest);
    }
}
