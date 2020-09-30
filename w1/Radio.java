package w1;

import java.util.Scanner;
import java.lang.Math;

public class Radio {
    public static void main(String[] args) {
        double radius, area;
        String textArea;
        Scanner newScanner = new Scanner(System.in);
        radius = newScanner.nextDouble();
        area = Math.PI * Math.pow(radius, 2);
        textArea = String.format("%.2f", area);
        System.out.println(textArea);
        newScanner.close();
    }
}