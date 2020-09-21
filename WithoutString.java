import java.util.Scanner;

public class WithoutString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String wordTwo = scan.next();
        while (word.indexOf(wordTwo) != -1) {
            int index = word.indexOf(wordTwo);
            word = word.substring(0, index) + word.substring(index + wordTwo.length(), word.length());
        }
        System.out.println(word);
        scan.close();
    }
}
