package w1;

import java.util.Scanner;
import java.lang.Math;

public class Hipotenusa {
    public static void main(String[] args) {
        double base, height, hipotenuse;
        String textHipotenuse;
        Scanner newScanner = new Scanner(System.in);
        base = newScanner.nextDouble();
        height = newScanner.nextDouble();
        hipotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        textHipotenuse = String.format("%.2f", hipotenuse);
        System.out.println(textHipotenuse);
        newScanner.close();
    }
}
