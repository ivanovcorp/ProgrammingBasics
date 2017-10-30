import java.util.Scanner;

public class Task_05_MaxNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int biggest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currNum = Integer.parseInt(sc.nextLine());
            if (currNum > biggest) {
                biggest = currNum;
            }
        }

        System.out.println(biggest);
    }
}
