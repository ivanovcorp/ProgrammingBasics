import java.util.Scanner;

public class p12_SpeedInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = Double.parseDouble(sc.nextLine());

        if (number <= 10) {
            System.out.println("slow");
        } else if (number > 10 && number <= 50) {
            System.out.println("average");
        } else if (number > 50 && number <= 150) {
            System.out.println("fast");
        } else if (number > 150 && number <= 1000) {
            System.out.println("ultra fast");
        } else
            System.out.println("extremely fast");
    }
}
