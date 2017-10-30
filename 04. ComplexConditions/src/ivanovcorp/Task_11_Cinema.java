package ivanovcorp;

import java.util.Scanner;

public class Task_11_Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String typeOfMovie = sc.nextLine();
        int rows = Integer.parseInt(sc.nextLine());
        int columns = Integer.parseInt(sc.nextLine());

        double premierePrice = 12;
        double normalPrice = 7.50;
        double discountPrice = 5;

        switch (typeOfMovie) {
            case "Premiere":
                System.out.printf("%.2f leva", premierePrice * rows * columns);
                break;
            case "Normal":
                System.out.printf("%.2f leva", normalPrice * rows * columns);
                break;
            case "Discount":
                System.out.printf("%.2f leva", discountPrice * rows * columns);
                break;
        }
    }
}
