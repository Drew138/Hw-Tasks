package w7;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palabra = scan.next().toLowerCase();
        System.out.println(palabra.length() + "\n" + palabra.indexOf("a"));
    }
}