package w4;

import java.util.Scanner;

public class Estrellas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int total = 0;
        int rating = scan.nextInt();
        while (rating >= 0) {
            switch (rating) {
                case 0:
                    zeros += 1;
                    break;
                case 1:
                    ones += 1;
                    break;
                case 2:
                    twos += 1;
                    break;
                case 3:
                    threes += 1;
                    break;
                case 4:
                    fours += 1;
                    break;
                case 5:
                    fives += 1;
                    break;
            }
            total += 1;
            rating = scan.nextInt();
        }
        scan.close();
        System.out.println("0(" + zeros + ") *(" + ones + ") **(" + twos + ") ***(" + threes + ") ****(" + fours
                + ") *****(" + fives + ")");
        System.out.println("Total: " + total);
    }
}