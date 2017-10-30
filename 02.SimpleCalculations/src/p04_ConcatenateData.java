import java.util.Scanner;

public class p04_ConcatenateData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String homeTown = sc.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, homeTown);
    }
}
