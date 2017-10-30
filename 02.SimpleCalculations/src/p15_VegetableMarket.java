import java.util.Scanner;

public class p15_VegetableMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double priceForAKiloVegetable = Double.parseDouble(sc.nextLine());
        double priceForAKiloFruits = Double.parseDouble(sc.nextLine());
        int allVegetablesWeight = Integer.parseInt(sc.nextLine());
        int allFruitsWeight = Integer.parseInt(sc.nextLine());
        double euroCourse = 1.94;

        if (priceForAKiloFruits <= 1000 && priceForAKiloVegetable <= 1000 && allFruitsWeight <= 1000 && allVegetablesWeight <= 1000) {
            double incomeVegetable = priceForAKiloVegetable * allVegetablesWeight;
            double incomeFruits = priceForAKiloFruits * allFruitsWeight;
            double allIncome = incomeFruits + incomeVegetable;
            System.out.println(allIncome / euroCourse);
        }

       /* double allIncome = ((priceForAKiloVegetable * allVegetablesWeight) + (priceForAKiloFruits * allFruitsWeight)) / euroCourse;
        System.out.println(allIncome);*/
    }
}
