import java.util.Scanner;

public class p01_CheckMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mark = Double.parseDouble(sc.nextLine());
        if (mark > 5.49) {
            System.out.println("Excellent!");
        }
    }
}
