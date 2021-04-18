import java.util.Scanner;
import java.util.HashMap;

public class fibonnacciRecursive {
    public static int i = 2;
    public static HashMap<Integer, Integer> solutions = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        solutions.put(0, 0);
        solutions.put(1, 1);
        solutions.put(2, 1);
        System.out.println(fibonnacciRecursive.fibonnacci(num));
        scan.close();
    }

    public static int fibonnacci(int num) {

        if (solutions.containsKey(num)) {
            return solutions.get(num);
        }
        solutions.put(num, fibonnacci(num - 1) + fibonnacci(num - 2));
        return solutions.get(num);
    }

    public void fibonnacci(double num) {

    }

    private void fibonnacci(String num) {

    }
}
