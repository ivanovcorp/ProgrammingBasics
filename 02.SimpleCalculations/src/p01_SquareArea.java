import java.util.Scanner;

public class p01_SquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a = ");
        int a = Integer.parseInt(sc.nextLine());
        int area = a * a;
        System.out.println("Square = " + area);
    }
}
