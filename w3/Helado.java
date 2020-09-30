package w3;

import java.util.Scanner;

class Helado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if (temperature > 27) {
            System.out.println("Comprar helado cerveza");
        }
        scanner.close();
    }

}