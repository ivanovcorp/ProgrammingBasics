package ivanovcorp;

import java.util.Scanner;

public class Task_03_PointInRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = Double.parseDouble(sc.nextLine());
        double y1 = Double.parseDouble(sc.nextLine());

        double x2 = Double.parseDouble(sc.nextLine());
        double y2 = Double.parseDouble(sc.nextLine());

        double x = Double.parseDouble(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());

        if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}
