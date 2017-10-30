import java.util.Scanner;

public class p14_TimePlus15Mins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        int currMins = minutes + 15;

        if (currMins > 59) {
            hours += 1;
            int tempMins = currMins - 60;
            currMins = 0;
            currMins = tempMins;
        }

        if (hours > 23) {
            hours = 0;
        }

        if (currMins < 10) {
            System.out.println(hours + ":0" + currMins);
        } else {
            System.out.println(hours + ":" + currMins);
        }
    }
}
