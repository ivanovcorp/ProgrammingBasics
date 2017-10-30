import java.util.Scanner;

public class p13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 0;
        double b = 0;
        String figure = sc.nextLine();
        switch (figure) {
            case "square":
                a = Double.parseDouble(sc.nextLine());
                System.out.printf("%.3f",(a * a));
                break;
            case "circle":
                a = Double.parseDouble(sc.nextLine());
                System.out.printf("%.3f",(Math.PI * Math.pow(a, 2)));
                break;
            case "rectangle":
                a = Double.parseDouble(sc.nextLine());
                b = Double.parseDouble(sc.nextLine());
                System.out.printf("%.3f", (a * b));
                break;
            case "triangle":
                a = Double.parseDouble(sc.nextLine());
                b = Double.parseDouble(sc.nextLine());
                System.out.printf("%.3f", ((a * b) / 2));
        }
    }
}
