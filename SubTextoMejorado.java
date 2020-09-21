import java.util.Scanner;

public class SubTextoMejorado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int initPos = scan.nextInt();
        int finPos = scan.nextInt();
        if (finPos + 1 > word.length()) {
            System.out.println("Error");
        } else if (initPos > finPos) {
            System.out.println("Error2");
        } else {
            System.out.println(word.substring(initPos, finPos + 1));
        }
        scan.close();
    }
}
