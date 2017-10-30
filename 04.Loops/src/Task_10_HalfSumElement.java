import java.util.Scanner;

public class Task_10_HalfSumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int biggest = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int currNum = Integer.parseInt(sc.nextLine());
            if (currNum > biggest) {
                biggest = currNum;
            }

            sum += currNum;
        }

        sum -= biggest;
        if (biggest == sum) {
            System.out.println("Yes Sum = " + sum);
        } else {
            System.out.println("No Diff = " + Math.abs(biggest - sum));
        }
    }
}
