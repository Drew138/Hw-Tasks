package w4;

import java.util.Scanner;

public class ContIncrDecr {
    public static void main(String[] args) {
        double num = 0;
        int contador = 0;
        String message = "";
        Scanner scan = new Scanner(System.in);
        String unkDouble = scan.next();
        unkDouble = unkDouble.replace(",", ".");
        boolean isGreater = Double.parseDouble(unkDouble) > num;
        do {
            if (isGreater) {
                contador += 1;
                message = message.concat("+1\n");
            } else {
                contador -= 1;
                message = message.concat("-1\n");
            }
            num = Double.parseDouble(unkDouble);
            unkDouble = scan.next();
            unkDouble = unkDouble.replace(",", ".");
            isGreater = Double.parseDouble(unkDouble) > num;
        } while (Double.parseDouble(unkDouble) != 0);
        System.out.println(message + "\nContador: " + contador);
        scan.close();
    }
}