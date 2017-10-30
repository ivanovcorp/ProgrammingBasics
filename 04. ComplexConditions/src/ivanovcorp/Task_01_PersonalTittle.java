package ivanovcorp;

import java.util.Scanner;

public class Task_01_PersonalTittle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double age = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine().toLowerCase();

        if (gender.equals("m")) {
            if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }

        } else {
            if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        }
    }
}
