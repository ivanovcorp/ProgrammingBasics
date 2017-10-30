import java.util.Scanner;

public class p11_FromDollarsToLeva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fixedCourse = 1.79549;

        double usd = Double.parseDouble(sc.nextLine());

        double result = usd * fixedCourse;

        System.out.printf("%.2f BGN", result);
    }
}
