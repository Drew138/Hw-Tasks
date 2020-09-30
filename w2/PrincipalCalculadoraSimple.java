package w2;

import java.util.Scanner;

public class PrincipalCalculadoraSimple {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        CalculadoraSimple calc = new CalculadoraSimple();
        int numOne = newScan.nextInt();
        int numTwo = newScan.nextInt();
        int sum = calc.sumar(numOne, numTwo);
        System.out.println(sum);
        int sub = calc.restar(numOne, numTwo);
        System.out.println(sub);
    }
}