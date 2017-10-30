import java.util.Scanner;

public class p09_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius = Double.parseDouble(sc.nextLine());
        double fahrenheit = (1.8 * celsius) + 32;
        System.out.printf("%.2f", fahrenheit);
    }
}
