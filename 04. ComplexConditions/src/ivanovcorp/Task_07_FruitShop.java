package ivanovcorp;

import java.util.Scanner;

public class Task_07_FruitShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.nextLine().toLowerCase();
        String dayOfWeek = sc.nextLine().toLowerCase();
        double quantity = Double.parseDouble(sc.nextLine());

        if ((fruit.contains("banana") || fruit.contains("apple") || fruit.contains("orange") ||
                fruit.contains("grapefruit") || fruit.contains("kiwi") || fruit.contains("pineapple") ||
                fruit.contains("grapes")) && (dayOfWeek.equals("monday") || dayOfWeek.equals("tuesday") ||
                dayOfWeek.equals("wednesday") || dayOfWeek.equals("thursday") || dayOfWeek.equals("friday") ||
                dayOfWeek.equals("saturday") || dayOfWeek.equals("sunday"))) {
            double priceBanana = 0;
            double priceApple = 0;
            double priceOrange = 0;
            double priceGrapefruit = 0;
            double priceKiwi = 0;
            double pricePineapple = 0;
            double priceGrapes = 0;

            if (dayOfWeek.equals("saturday") || dayOfWeek.equals("sunday")) {
                priceBanana = 2.70;
                priceApple = 1.25;
                priceOrange = 0.90;
                priceGrapefruit = 1.60;
                priceKiwi = 3.0;
                pricePineapple = 5.60;
                priceGrapes = 4.20;
            } else {
                priceBanana = 2.50;
                priceApple = 1.20;
                priceOrange = 0.85;
                priceGrapefruit = 1.45;
                priceKiwi = 2.70;
                pricePineapple = 5.50;
                priceGrapes = 3.85;
            }

            switch (fruit) {
                case "banana":
                    System.out.println(priceBanana * quantity);
                    break;
                case "apple":
                    System.out.println(priceApple * quantity);
                    break;
                case "orange":
                    System.out.println(priceOrange * quantity);
                    break;
                case "grapefruit":
                    System.out.println(priceGrapefruit * quantity);
                    break;
                case "kiwi":
                    System.out.println(priceKiwi * quantity);
                    break;
                case "pineapple":
                    System.out.println(pricePineapple * quantity);
                    break;
                case "grapes":
                    System.out.println(priceGrapes * quantity);
                    break;
            }
        } else {
            System.out.println("error");
        }
    }
}
