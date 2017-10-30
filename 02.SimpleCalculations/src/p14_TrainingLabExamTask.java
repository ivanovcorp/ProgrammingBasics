import java.util.Scanner;

public class p14_TrainingLabExamTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lenght = Double.parseDouble(sc.nextLine()) * 100;
        double width = Double.parseDouble(sc.nextLine()) * 100;

        double hall = 100;
        int rows = (int)lenght / 120;
        int placesInARow = ((int)width - 100) / 70;
        System.out.println(placesInARow);
        System.out.println(rows);
        int allPlaces = (rows * placesInARow) - 3;
        System.out.println(allPlaces);

    }
}
