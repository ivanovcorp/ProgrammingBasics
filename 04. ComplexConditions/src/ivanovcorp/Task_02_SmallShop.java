package ivanovcorp;

import java.util.Scanner;

public class Task_02_SmallShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine().toLowerCase();
        String city = sc.nextLine().toLowerCase();
        double quantity = Double.parseDouble(sc.nextLine());

        double fixedCoffeePrice = 0;
        double fixedWaterPrice = 0;
        double fixedBeerPrice = 0;
        double fixedSweetsPrice = 0;
        double fixedPeanutsPrice = 0;

        if (city.equals("sofia")) {
            fixedCoffeePrice = 0.50;
            fixedWaterPrice = 0.80;
            fixedBeerPrice = 1.20;
            fixedSweetsPrice = 1.45;
            fixedPeanutsPrice = 1.60;

            switch (product) {
                case "coffee":
                    System.out.println(quantity * fixedCoffeePrice);
                    break;
                case "water":
                    System.out.println(quantity * fixedWaterPrice);
                    break;
                case "beer":
                    System.out.println(quantity * fixedBeerPrice);
                    break;
                case "sweets":
                    System.out.println(quantity * fixedSweetsPrice);
                    break;
                case "peanuts":
                    System.out.println(quantity * fixedPeanutsPrice);
                    break;
            }
        } else if (city.equals("plovdiv")) {
            fixedCoffeePrice = 0.40;
            fixedWaterPrice = 0.70;
            fixedBeerPrice = 1.15;
            fixedSweetsPrice = 1.30;
            fixedPeanutsPrice = 1.50;

            switch (product) {
                case "coffee":
                    System.out.println(quantity * fixedCoffeePrice);
                    break;
                case "water":
                    System.out.println(quantity * fixedWaterPrice);
                    break;
                case "beer":
                    System.out.println(quantity * fixedBeerPrice);
                    break;
                case "sweets":
                    System.out.println(quantity * fixedSweetsPrice);
                    break;
                case "peanuts":
                    System.out.println(quantity * fixedPeanutsPrice);
                    break;
            }
        } else {
            fixedCoffeePrice = 0.45;
            fixedWaterPrice = 0.70;
            fixedBeerPrice = 1.10;
            fixedSweetsPrice = 1.35;
            fixedPeanutsPrice = 1.55;

            switch (product) {
                case "coffee":
                    System.out.println(quantity * fixedCoffeePrice);
                    break;
                case "water":
                    System.out.println(quantity * fixedWaterPrice);
                    break;
                case "beer":
                    System.out.println(quantity * fixedBeerPrice);
                    break;
                case "sweets":
                    System.out.println(quantity * fixedSweetsPrice);
                    break;
                case "peanuts":
                    System.out.println(quantity * fixedPeanutsPrice);
                    break;
            }
        }
    }
}
