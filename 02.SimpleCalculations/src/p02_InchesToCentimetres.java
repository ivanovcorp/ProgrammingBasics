import java.util.Scanner;

public class p02_InchesToCentimetres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("inches: ");
        double inches = Double.parseDouble(sc.nextLine());
        double centimeters = inches * 2.54;
        System.out.println("centimeters: " + centimeters);
    }
}
