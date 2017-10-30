public class Task_01_RectangleWith10x10Stars {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String ch = "*";
        for (int i = 0; i < 10; i++) {
            sb.append(ch);
        }
        sb.toString();
        for (int i = 0; i < 10; i++) {
            System.out.println(sb);
        }
    }
}
