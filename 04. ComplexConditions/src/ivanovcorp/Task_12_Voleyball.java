package ivanovcorp;

import java.util.Scanner;

public class Task_12_Voleyball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String typeOfYear = sc.nextLine().toLowerCase(); // can be only: LEAP or NORMAL (lower case)
        int countOfHolidayWhichAreNotInWeekends = Integer.parseInt(sc.nextLine());
        int countOfWeekendsWhenPersonTravels = Integer.parseInt(sc.nextLine());

        // he plays only in weekends and holidays
        // plays in Sofia every saturday, when he is not working and he is not travelling
        // to hometown
        // plays 2/3 on holidays
        // he plays voleyball on sunday when he is in his hometown
        // he is not working 3 / 4 of the weekends

        int weekendsEveryYear = 48;

        // weekends in Sofia
        double weekendsInSofia = weekendsEveryYear - countOfWeekendsWhenPersonTravels;

        // result 1
        double saturdayGames = weekendsInSofia * (3.0 / 4.0);

        // result 2
        double holidayGames = countOfHolidayWhichAreNotInWeekends * (2.0 / 3.0);

        // result 3
        double whenInHometownGames = countOfWeekendsWhenPersonTravels;

        double finalGames = saturdayGames + holidayGames + whenInHometownGames;
// check below
        double result = finalGames;
        if (typeOfYear.equals("leap")) {
            result += (0.15 * result);
        }

        System.out.println(Math.floor(result));
    }
}
