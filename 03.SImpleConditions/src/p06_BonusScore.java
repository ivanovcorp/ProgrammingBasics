import java.util.Scanner;

public class p06_BonusScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());

        double score = 0;
        double bonusScore = 0;
        int lastNum = a % 10;
        if (a % 2 == 0) {
            bonusScore += 1;
        }

        if (lastNum == 5) {
            bonusScore += 2;
        }

        if (a >= 0 && a <= 100) {
            bonusScore += 5;
            System.out.println(bonusScore);
            System.out.println(bonusScore + a);
        } else if (a > 100 && a < 1000) {
            bonusScore += (a * 0.2);
            System.out.println(bonusScore);
            System.out.println(bonusScore + a);
        } else {
            bonusScore += (a * 0.1);
            System.out.println(bonusScore);
            System.out.println(bonusScore + a);
        }
    }
}
