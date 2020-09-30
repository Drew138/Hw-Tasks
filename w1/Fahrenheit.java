package w1;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        double fahrenheit, celcius;
        String textFahrenheit;
        Scanner newScanner = new Scanner(System.in);
        celcius = newScanner.nextDouble();
        fahrenheit = ((9 * celcius) / 5) + 32;
        textFahrenheit = String.format("%.2f", fahrenheit);
        System.out.println(textFahrenheit);
        newScanner.close();
    }
}
