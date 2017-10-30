import java.util.Scanner;

public class Task_09_VowelsSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().toLowerCase();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' ||
                    input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                switch (input.charAt(i)) {
                    case 'a':
                        sum += 1;
                        break;
                    case 'e':
                        sum += 2;
                        break;
                    case 'i':
                        sum += 3;
                        break;
                    case 'o':
                        sum += 4;
                        break;
                    case 'u':
                        sum += 5;
                        break;
                }
            }
        }
        System.out.println(sum);
    }
}
