import java.util.Scanner;

public class ContIncrDecr {
    public static void main(String[] args) {
        double num = 0;
        int contador = 0;
        String message = "";
        Scanner scan = new Scanner(System.in);
        double unkDouble = scan.nextDouble();
        boolean isGreater = unkDouble > num;
        do {
            if (isGreater) {
                contador += 1;
                message = message.concat("+1\n");
            } else {
                contador -= 1;
                message = message.concat("-1\n");
            }
            num = unkDouble;
            unkDouble = scan.nextDouble();
            isGreater = unkDouble > num;
        } while (unkDouble != 0);
        System.out.println(message + "\nContador: " + contador);
        scan.close();
    }
}