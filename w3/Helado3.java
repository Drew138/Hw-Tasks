package w3;

import java.util.Scanner;

public class Helado3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        int age = scanner.nextInt();
        if ((temperature > 27) && (age >= 18)) {
            int money = scanner.nextInt();
            if (money > 5000) {
                System.out.println("Comprar helado cerveza");
            } else {
                System.out.println("De que me hablas viejo");
            }
        } else {
            System.out.println("Lo sentimos juventud");
        }
        scanner.close();
    }
}