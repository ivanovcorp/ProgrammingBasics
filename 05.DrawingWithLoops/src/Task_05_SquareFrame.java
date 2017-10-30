import java.util.Scanner;

public class Task_05_SquareFrame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        firstOrLastLine(n);
        printMiddleLine(n);
        firstOrLastLine(n);
    }

    static void printMiddleLine(int n) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("|");
        for (int j = 0; j < n - 2; j++) {
            sb1.append(" ");
            sb1.append("-");
        }
        sb1.append(" |");
        for (int i = 0; i < n - 2; i++) {
            System.out.println(sb1.toString());
        }
    }

    static void firstOrLastLine(int n) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("+");
        for (int i = 0; i < n - 2; i++) {
            sb1.append(" ");
            sb1.append("-");
        }
        sb1.append(" +");
        System.out.println(sb1.toString());
    }
}
