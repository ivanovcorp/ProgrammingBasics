import java.util.Scanner;

public class Task_07_LeftAndRightSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            leftSum += Integer.parseInt(sc.nextLine());
        }

        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            rightSum += Integer.parseInt(sc.nextLine());
        }

        if (leftSum - rightSum == 0) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            System.out.println("No, diff = " + (leftSum - rightSum < 0 ? (leftSum - rightSum) * -1 : leftSum - rightSum));
        }
    }
}
