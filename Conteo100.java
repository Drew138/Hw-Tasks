import java.util.Scanner;

public class Conteo100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int count = 0;
        while (true) {
            num = scan.nextInt();

            if (num > 100) {
                count += 1;
            } else if (num ==0) {
                System.out.println(count);
                break;
            }
        }

        scan.close();
    }
}