import java.util.Scanner;

public class p08_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = Double.parseDouble(sc.nextLine());
        double height = Double.parseDouble(sc.nextLine());

        double area = (side * height) / 2;

        System.out.printf("Triangle area = %.2f", area);
    }
}
