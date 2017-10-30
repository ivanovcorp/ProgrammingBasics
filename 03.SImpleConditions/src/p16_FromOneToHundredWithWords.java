import java.util.Scanner;

public class p16_FromOneToHundredWithWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        if (num == 100) {
            System.out.println("One Hundred");
        } else if (num >= 0 && num < 20) {
            switch (num) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else if (num < 0 || num > 100){
            System.out.println("invalid number");
        } else {
            String result = "";
            int lastNum = num % 10;
            num /= 10;
            int firstNum = num % 10;

            switch (firstNum) {
                case 2:
                    result += "twenty";
                    switch (lastNum) {
                        case 1:
                            result += " one";
                            break;
                        case 2:
                            result += " two";
                            break;
                        case 3:
                            result += " three";
                            break;
                        case 4:
                            result += " four";
                            break;
                        case 5:
                            result += " five";
                            break;
                        case 6:
                            result += " six";
                            break;
                        case 7:
                            result += " seven";
                            break;
                        case 8:
                            result += " eight";
                            break;
                        case 9:
                            result += " nine";
                            break;
                    }
                    break;
                case 3:
                    result += "thirty";
                    switch (lastNum) {
                        case 1:
                            result += " one";
                            break;
                        case 2:
                            result += " two";
                            break;
                        case 3:
                            result += " three";
                            break;
                        case 4:
                            result += " four";
                            break;
                        case 5:
                            result += " five";
                            break;
                        case 6:
                            result += " six";
                            break;
                        case 7:
                            result += " seven";
                            break;
                        case 8:
                            result += " eight";
                            break;
                        case 9:
                            result += " nine";
                            break;
                    }
                    break;
                case 4:
                    result += "fourty";
                    switch (lastNum) {
                        case 1:
                            result += " one";
                            break;
                        case 2:
                            result += " two";
                            break;
                        case 3:
                            result += " three";
                            break;
                        case 4:
                            result += " four";
                            break;
                        case 5:
                            result += " five";
                            break;
                        case 6:
                            result += " six";
                            break;
                        case 7:
                            result += " seven";
                            break;
                        case 8:
                            result += " eight";
                            break;
                        case 9:
                            result += " nine";
                            break;
                    }
                    break;
                case 5:
                    result += "fifty";
                    switch (lastNum) {
                        case 1:
                            result += " one";
                            break;
                        case 2:
                            result += " two";
                            break;
                        case 3:
                            result += " three";
                            break;
                        case 4:
                            result += " four";
                            break;
                        case 5:
                            result += " five";
                            break;
                        case 6:
                            result += " six";
                            break;
                        case 7:
                            result += " seven";
                            break;
                        case 8:
                            result += " eight";
                            break;
                        case 9:
                            result += " nine";
                            break;
                    }
                    break;
                case 6:
                    result += "sixty";
                    switch (lastNum) {
                        case 1:
                            result += " one";
                            break;
                        case 2:
                            result += " two";
                            break;
                        case 3:
                            result += " three";
                            break;
                        case 4:
                            result += " four";
                            break;
                        case 5:
                            result += " five";
                            break;
                        case 6:
                            result += " six";
                            break;
                        case 7:
                            result += " seven";
                            break;
                        case 8:
                            result += " eight";
                            break;
                        case 9:
                            result += " nine";
                            break;
                    }
                    break;
                case 7:
                    result += "seventy";
                    switch (lastNum) {
                        case 1:
                            result += " one";
                            break;
                        case 2:
                            result += " two";
                            break;
                        case 3:
                            result += " three";
                            break;
                        case 4:
                            result += " four";
                            break;
                        case 5:
                            result += " five";
                            break;
                        case 6:
                            result += " six";
                            break;
                        case 7:
                            result += " seven";
                            break;
                        case 8:
                            result += " eight";
                            break;
                        case 9:
                            result += " nine";
                            break;
                    }
                    break;
                case 8:
                    result += "eighty";
                    switch (lastNum) {
                        case 1:
                            result += " one";
                            break;
                        case 2:
                            result += " two";
                            break;
                        case 3:
                            result += " three";
                            break;
                        case 4:
                            result += " four";
                            break;
                        case 5:
                            result += " five";
                            break;
                        case 6:
                            result += " six";
                            break;
                        case 7:
                            result += " seven";
                            break;
                        case 8:
                            result += " eight";
                            break;
                        case 9:
                            result += " nine";
                            break;
                    }
                    break;
                case 9:
                    result += "ninety";
                    switch (lastNum) {
                        case 1:
                            result += " one";
                            break;
                        case 2:
                            result += " two";
                            break;
                        case 3:
                            result += " three";
                            break;
                        case 4:
                            result += " four";
                            break;
                        case 5:
                            result += " five";
                            break;
                        case 6:
                            result += " six";
                            break;
                        case 7:
                            result += " seven";
                            break;
                        case 8:
                            result += " eight";
                            break;
                        case 9:
                            result += " nine";
                            break;
                    }
                    break;
            }

            System.out.println(result);
        }
    }
}
