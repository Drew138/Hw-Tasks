package w7;

import java.util.Scanner;

public class SubTexto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int initPos = scan.nextInt();
        int finPos = scan.nextInt();
        System.out.println(word.substring(initPos, finPos + 1));
        scan.close();
    }
}
