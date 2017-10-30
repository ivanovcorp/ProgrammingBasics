import java.util.Scanner;

public class p11_EqualWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.nextLine().toLowerCase();
        String secondWord = sc.nextLine().toLowerCase();

        boolean areEqual = firstWord.equals(secondWord);
        if (areEqual) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
