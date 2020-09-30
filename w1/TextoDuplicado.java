package w1;

import java.util.Scanner;

public class TextoDuplicado {
    public static void main(String[] args) {
        String text;
        Scanner scan = new Scanner(System.in);
        text = scan.next();
        System.out.println(text + text);
        scan.close();
    }
}