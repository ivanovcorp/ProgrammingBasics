import java.util.Scanner;

public class p12_CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fixedUsd = 1.79549;
        double fixedEuro = 1.95583;
        double fixedGBP = 2.53405;

        double moneyEntered = Double.parseDouble(sc.nextLine());
        String firstVal = sc.nextLine();
        String secondVal = sc.nextLine();

        double result = 0;

        switch (firstVal) {
            case "BGN":
                switch (secondVal) {
                    case "USD":
                        result = moneyEntered / fixedUsd;
                        break;
                    case "EUR":
                        result = moneyEntered / fixedEuro;
                        break;
                    case "GBP":
                        result = moneyEntered / fixedGBP;
                        break;
                }
                break;
            case "USD":
                switch (secondVal) {
                    case "BGN":
                        result = moneyEntered * fixedUsd;
                        break;
                    case "EUR":
                        result = (moneyEntered * fixedUsd) / fixedEuro;
                        break;
                    case "GBP":
                        result = (moneyEntered * fixedUsd) / fixedGBP;
                        break;
                }
                break;
            case "EUR":
                switch (secondVal) {
                    case "USD":
                        result = (moneyEntered * fixedEuro) / fixedUsd;
                        break;
                    case "BGN":
                        result = moneyEntered * fixedEuro;
                        break;
                    case "GBP":
                        result = (moneyEntered * fixedEuro) / fixedGBP;
                        break;
                }
                break;
            case "GBP":
                switch (secondVal) {
                    case "USD":
                        result = (moneyEntered * fixedGBP) / fixedUsd;
                        break;
                    case "EUR":
                        result = (moneyEntered * fixedGBP) / fixedEuro;
                        break;
                    case "BGN":
                        result = moneyEntered * fixedGBP;
                        break;
                }
                break;
        }

        System.out.printf("%.2f", result);
    }
}
