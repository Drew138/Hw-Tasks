package w1;

import java.util.Scanner;
import java.lang.Math;

public class Mayores {
    public static void main(String[] args) {
        int numOne, numTwo;
        Scanner newScanner = new Scanner(System.in);
        numOne = newScanner.nextInt();
        numTwo = newScanner.nextInt();
        System.out.println(numOne + numTwo);
        System.out.println(numOne * numTwo);
        newScanner.close();
    }
}
