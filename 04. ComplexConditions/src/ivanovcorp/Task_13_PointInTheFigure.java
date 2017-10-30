package ivanovcorp;

import java.util.Scanner;

public class Task_13_PointInTheFigure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = Integer.parseInt(sc.nextLine());
        double x = Double.parseDouble(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());

        int figureBlocks = 6;
        int areaOfBlock = h * h;

        boolean conditionX = x >= 0 && x <= 3 * h && y >= 0 && y <= h;
        boolean conditionY = x >= h && x <= 2 * h && y >= 0 && y <= 4 * h;
        boolean conditionXY = x >= h && x <= 2 * h && y >= 0 && y <= h;

        if (conditionX || conditionY || conditionXY) {
            System.out.println("inside");
        } else {
            System.out.println("outside");
        }

    }
}