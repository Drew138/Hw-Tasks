import java.util.Scanner;

public class DeFront {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next().toLowerCase();
        if ((word.charAt(0) != 'a') && (word.charAt(1) != 'b')) {
            word = word.substring(2, word.length());
        } else if ((word.charAt(0) != 'a') && (word.charAt(1) == 'b')) {
            word = word.substring(1, word.length());
        } else if ((word.charAt(0) == 'a') && (word.charAt(1) != 'b')) {
            word = "a" + word.substring(2, word.length());
        }
        scan.close();
        System.out.println(word);
    }
}
