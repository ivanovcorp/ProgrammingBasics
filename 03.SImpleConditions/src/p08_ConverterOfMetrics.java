import java.util.Scanner;

public class p08_ConverterOfMetrics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = Double.parseDouble(sc.nextLine());
        String me1 = sc.nextLine();
        String me2 = sc.nextLine();

        // All values are fixed to meter
        double mm = 1000; //1m
        double cm = 100;//1m
        double mi = 0.000621371192;//1m
        double in = 39.3700787;//1m
        double km = 0.001;//1m
        double ft = 3.28083999;//1m
        double yd = 1.0936133;//1m

        switch (me1) {
            case "m":
                switch (me2) {
                    case "mm":
                        System.out.println(num * mm);
                        break;
                    case "cm":
                        System.out.println(num * cm);
                        break;
                    case "mi":
                        System.out.println(num * mi);
                        break;
                    case "in":
                        System.out.println(num * in);
                        break;
                    case "km":
                        System.out.println(num * km);
                        break;
                    case "ft":
                        System.out.println(num * ft);
                        break;
                    case "yd":
                        System.out.println(num * yd);
                        break;
                    case "m":
                        System.out.println(num);
                }
                break;
            case "mm":
                switch (me2) {
                    case "mm":
                        System.out.println(num);
                        break;
                    case "cm":
                        System.out.println((num / mm) * cm);
                        break;
                    case "mi":
                        System.out.println((num / mm) * mi);
                        break;
                    case "in":
                        System.out.println((num / mm) * in);
                        break;
                    case "km":
                        System.out.println((num / mm) * km);
                        break;
                    case "ft":
                        System.out.println((num / mm) * ft);
                        break;
                    case "yd":
                        System.out.println((num / mm) * yd);
                        break;
                    case "m":
                        System.out.println(num / mm);
                        break;
                }
                break;
            case "cm":
                switch (me2) {
                    case "cm":
                        System.out.println(num);
                        break;
                    case "mm":
                        System.out.println((num / cm) * mm);
                        break;
                    case "mi":
                        System.out.println((num / cm) * mi);
                        break;
                    case "in":
                        System.out.println((num / cm) * in);
                        break;
                    case "km":
                        System.out.println((num / cm) * km);
                        break;
                    case "ft":
                        System.out.println((num / cm) * ft);
                        break;
                    case "yd":
                        System.out.println((num / cm) * yd);
                        break;
                    case "m":
                        System.out.println(num / cm);
                        break;
                }
                break;
            case "mi":
                switch (me2) {
                    case "mi":
                        System.out.println(num);
                        break;
                    case "mm":
                        System.out.println((num / mi) * mm);
                        break;
                    case "cm":
                        System.out.println((num / mi) * cm);
                        break;
                    case "in":
                        System.out.println((num / mi) * in);
                        break;
                    case "km":
                        System.out.println((num / mi) * km);
                        break;
                    case "ft":
                        System.out.println((num / mi) * ft);
                        break;
                    case "yd":
                        System.out.println((num / mi) * yd);
                        break;
                    case "m":
                        System.out.println(num / mi);
                        break;
                }
                break;
            case "in":
                switch (me2) {
                    case "in":
                        System.out.println(num);
                        break;
                    case "mm":
                        System.out.println((num / in) * mm);
                        break;
                    case "cm":
                        System.out.println((num / in) * cm);
                        break;
                    case "mi":
                        System.out.println((num / in) * mi);
                        break;
                    case "km":
                        System.out.println((num / in) * km);
                        break;
                    case "ft":
                        System.out.println((num / in) * ft);
                        break;
                    case "yd":
                        System.out.println((num / in) * yd);
                        break;
                    case "m":
                        System.out.println(num / in);
                        break;
                }
                break;
            case "km":
                switch (me2) {
                    case "km":
                        System.out.println(num);
                        break;
                    case "mm":
                        System.out.println((num / km) * mm);
                        break;
                    case "cm":
                        System.out.println((num / km) * cm);
                        break;
                    case "mi":
                        System.out.println((num / km) * mi);
                        break;
                    case "in":
                        System.out.println((num / km) * in);
                        break;
                    case "ft":
                        System.out.println((num / km) * ft);
                        break;
                    case "yd":
                        System.out.println((num / km) * yd);
                        break;
                    case "m":
                        System.out.println(num / km);
                        break;
                }
                break;
            case "ft":
                switch (me2) {
                    case "ft":
                        System.out.println(num);
                        break;
                    case "mm":
                        System.out.println((num / ft) * mm);
                        break;
                    case "cm":
                        System.out.println((num / ft) * cm);
                        break;
                    case "mi":
                        System.out.println((num / ft) * mi);
                        break;
                    case "in":
                        System.out.println((num / ft) * in);
                        break;
                    case "km":
                        System.out.println((num / ft) * km);
                        break;
                    case "m":
                        System.out.println((num / ft));
                        break;
                    case "yd":
                        System.out.println((num / ft) * yd);
                        break;
                }
                break;
            case "yd":
                switch (me2) {
                    case "yd":
                        System.out.println(num);
                        break;
                    case "mm":
                        System.out.println((num / yd) * mm);
                        break;
                    case "cm":
                        System.out.println((num / yd) * cm);
                        break;
                    case "mi":
                        System.out.println((num / yd) * mi);
                        break;
                    case "in":
                        System.out.println((num / yd) * in);
                        break;
                    case "km":
                        System.out.println((num / yd) * km);
                        break;
                    case "ft":
                        System.out.println((num / yd) * ft);
                        break;
                    case "m":
                        System.out.println(num / yd);
                        break;
                }
                break;
        }
    }
}
