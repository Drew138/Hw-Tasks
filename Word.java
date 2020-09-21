import java.util.Scanner;
import java.lang.Math;

public class Word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int A = word.indexOf("A");
        int a = word.indexOf("a");

        if (a == -1 && A == -1) {
            a = -1;
        }

        else if (a < 0) {
            a = 500000;
        } else if (A < 0) {
            A = 50000000;
        }
        System.out.println(word.length() + "\n" + Math.min(A, a));
        scan.close();
    }
}