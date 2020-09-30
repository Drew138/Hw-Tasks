package w3;

import java.util.Scanner;

public class Helado2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        int edad = scanner.nextInt();
        if ((temperature > 27) && (edad >= 18)) {
            System.out.println("Comprar helado cerveza");
        } else {
            System.out.println("Lo sentimos juventud");
        }
        scanner.close();
    }
}