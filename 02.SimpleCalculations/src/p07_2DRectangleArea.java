import java.util.Scanner;

public class p07_2DRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 0;
        double y = 0;

        double x1 = Double.parseDouble(sc.nextLine());
        double y1 = Double.parseDouble(sc.nextLine());

        double x2 = Double.parseDouble(sc.nextLine());
        double y2 = Double.parseDouble(sc.nextLine());

        double width = Math.abs(x2 - x1);
        double height = Math.abs(y2 - y1);

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println(area);
        System.out.println(perimeter);
    }
}
