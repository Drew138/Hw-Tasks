import java.util.Scanner;

public class Multiplos5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt() + 1;

        for (int i= 1; i < number; i++) {
            double mod = i % 5.00;
            if (mod == 0) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}