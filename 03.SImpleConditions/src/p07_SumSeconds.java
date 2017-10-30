import java.util.Scanner;

public class p07_SumSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secondsFirstContestant = Integer.parseInt(sc.nextLine());
        int secondsSecondsContestant = Integer.parseInt(sc.nextLine());
        int secondsThirdContestant = Integer.parseInt(sc.nextLine());

        int minutes = 0;
        int seconds = 0;

        int sumSeconds = secondsFirstContestant + secondsSecondsContestant + secondsThirdContestant;
        minutes = sumSeconds / 60;
        seconds = sumSeconds % 60;

        if (seconds <= 9) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }

    }
}
