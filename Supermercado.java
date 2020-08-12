import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        int quantities = scanner.nextInt();
        if (type == 1) {
            System.out.println(quantities * 5);
        } else if (type == 2) {
            System.out.println(quantities * 10);
        } else if (type == 3) {
            System.out.println(quantities * 15);
        }
        scanner.close();
    }
}