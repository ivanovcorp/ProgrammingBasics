import java.util.Scanner;

public class p06_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radiues = Double.parseDouble(sc.nextLine());
        double area = Math.PI * radiues * radiues;
        double perimeter = 2 * Math.PI * radiues;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
