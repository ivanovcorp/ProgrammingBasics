package Task_04_TriangleOf55Stars;

public class TriangleOf55Stars {
    public static void main(String[] args) {
        for (int rows = 1; rows <= 10; rows++) {
            for (int stars = 0; stars < rows; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
