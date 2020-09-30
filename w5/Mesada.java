package w5;

import java.util.Scanner;

public class Mesada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int money;
        while (true) {
            money = scan.nextInt();
            if (money > 500) {
                System.out.println(name + " eres mi angel");
                break;
            } else {
                System.out.println(name + " me decepcionaste");
            }
        }
        scan.close();
    }
}