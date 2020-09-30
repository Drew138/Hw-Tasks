package w5;

import java.util.Scanner;

public class Infinito {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        while (true) {
            num = scan.nextInt();
            if (num == 0) {
                break;
            } else {
                System.out.println(num * 3);
            }
        }
        scan.close();
    }
}