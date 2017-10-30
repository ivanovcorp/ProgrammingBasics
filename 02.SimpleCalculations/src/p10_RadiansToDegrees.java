import java.util.Scanner;

public class p10_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rad = Double.parseDouble(sc.nextLine());
        double degrees = rad * (180 / Math.PI);

        System.out.println((int)degrees);
    }
}
