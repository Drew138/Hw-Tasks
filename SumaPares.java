import java.util.Scanner;

public class SumaPares {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2;
        int acumNum = 0;
        boolean isEven;
        for (int i=0; i < num; i++) {
            num2 = scan.nextInt();
            isEven = (num2 % 2) == 0;
            if (isEven) {
                acumNum += num2;
            }
        }
        System.out.println(acumNum);
        scan.close();
    }
}
