import java.util.Scanner;

public class p03_Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter your name: "); Commented this line since judge reads it
        String name = sc.nextLine();
        System.out.println();
        System.out.printf("Hello, %s!", name);
    }
}
