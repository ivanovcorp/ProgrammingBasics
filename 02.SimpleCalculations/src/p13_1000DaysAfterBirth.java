import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class p13_1000DaysAfterBirth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String readDate = sc.nextLine();
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        LocalDate lds = LocalDate.parse(readDate, dTF);
        System.out.println(lds.plusDays(999).format(dTF));
    }
}
