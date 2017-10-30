import java.util.Scanner;

public class Task_08_SunGlasses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int row = 1; row <= n; row++) {
            if (row == 1 || row == n) {
                for (int i = 0; i < 2 * n; i++) {
                    System.out.print("*");
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < 2 * n; i++) {
                    System.out.print("*");
                }
            } else {
                if (n % 2 != 0) {
                    if (row == (((n - 1) / 2) + 1)) {
                        System.out.print("*");
                        for (int i = 0; i < (2 * n) - 2; i++) {
                            System.out.print("/");
                        }
                        System.out.print("*");

                        for (int i = 0; i < n; i++) {
                            System.out.print("|");
                        }

                        System.out.print("*");
                        for (int i = 0; i < (2 * n) - 2; i++) {
                            System.out.print("/");
                        }
                        System.out.print("*");

                    } else {
                        System.out.print("*");
                        for (int i = 0; i < (2 * n) - 2; i++) {
                            System.out.print("/");
                        }
                        System.out.print("*");

                        for (int i = 0; i < n; i++) {
                            System.out.print(" ");
                        }

                        System.out.print("*");
                        for (int i = 0; i < (2 * n) - 2; i++) {
                            System.out.print("/");
                        }
                        System.out.print("*");
                    }
                } else {
                    if (row == (n / 2)) {
                        System.out.print("*");
                        for (int i = 0; i < (2 * n) - 2; i++) {
                            System.out.print("/");
                        }
                        System.out.print("*");

                        for (int i = 0; i < n; i++) {
                            System.out.print("|");
                        }

                        System.out.print("*");
                        for (int i = 0; i < (2 * n) - 2; i++) {
                            System.out.print("/");
                        }
                        System.out.print("*");
                    } else {
                        System.out.print("*");
                        for (int i = 0; i < (2 * n) - 2; i++) {
                            System.out.print("/");
                        }
                        System.out.print("*");

                        for (int i = 0; i < n; i++) {
                            System.out.print(" ");
                        }

                        System.out.print("*");
                        for (int i = 0; i < (2 * n) - 2; i++) {
                            System.out.print("/");
                        }
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
