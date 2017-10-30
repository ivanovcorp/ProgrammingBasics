import java.util.Scanner;

public class Task_08_EvenAndOddSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
            int currNum = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0) {
                evenSum += currNum;
            } else {
                oddSum += currNum;
            }
        }

        if (evenSum == oddSum) {
            System.out.println("Yes Sum = " + oddSum);
        } else {
            System.out.println("No Diff = " + (oddSum - evenSum < 0 ? (oddSum - evenSum) * -1 : oddSum - evenSum));
        }
    }
}
