import java.util.Scanner;

public class ExtraccionProfesional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String name, lastname;

        word = word.substring(18, word.length() - 1);

        int indName = word.indexOf("<");
        name = word.substring(0, indName);
        int indLast = word.indexOf("\'lastname\'>") + 11;
        word = word.substring(indLast, word.length() - 1);
        lastname = word.substring(0, word.indexOf("<"));
        System.out.println(name + lastname);
        scan.close();
    }
}
