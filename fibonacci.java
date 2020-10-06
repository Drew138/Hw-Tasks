import java.util.Scanner;

class fibonnacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] sol = new int[] { 0, 1 };

        if ((num == 0) || (num == 1)) {
            System.out.println(1);
            scan.close();
            return;
        }
        int i = 2;
        while (i <= num) {

            int next_fib = sol[0] + sol[1];
            sol[0] = sol[1];
            sol[1] = next_fib;
            i += 1;
        }
        System.out.println(sol[1]);
        scan.close();
    }
}