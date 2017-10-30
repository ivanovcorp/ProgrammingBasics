package ivanovcorp;

import java.util.Scanner;

public class Task_08_TradeComissions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine().toLowerCase();
        double volumeOfSales = Double.parseDouble(sc.nextLine());

        if (city.equals("sofia") && volumeOfSales >= 0) {
            double comission = 0;
            if (volumeOfSales >= 0 && volumeOfSales <= 500) {
                comission = 0.05;
            } else if (volumeOfSales > 500 && volumeOfSales <= 1000) {
                comission = 0.07;
            } else if(volumeOfSales > 1000 && volumeOfSales <= 10000) {
                comission = 0.08;
            } else {
                comission = 0.12;
            }
            System.out.printf("%.2f", comission * volumeOfSales);
        } else if (city.equals("varna") && volumeOfSales >= 0) {
            double comission = 0;
            if (volumeOfSales >= 0 && volumeOfSales <= 500) {
                comission = 0.045;
            } else if (volumeOfSales > 500 && volumeOfSales <= 1000) {
                comission = 0.075;
            } else if(volumeOfSales > 1000 && volumeOfSales <= 10000) {
                comission = 0.1;
            } else {
                comission = 0.13;
            }
            System.out.printf("%.2f", comission * volumeOfSales);
        } else if (city.equals("plovdiv") && volumeOfSales >= 0) {
            double comission = 0;
            if (volumeOfSales >= 0 && volumeOfSales <= 500) {
                comission = 0.055;
            } else if (volumeOfSales > 500 && volumeOfSales <= 1000) {
                comission = 0.08;
            } else if(volumeOfSales > 1000 && volumeOfSales <= 10000) {
                comission = 0.12;
            } else {
                comission = 0.145;
            }
            System.out.printf("%.2f", comission * volumeOfSales);
        } else {
            System.out.println("error");
        }
    }
}
