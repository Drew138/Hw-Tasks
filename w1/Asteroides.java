package w1;

import java.util.Scanner;

public class Asteroides {
    public static void main(String[] args) {
        int numAsteroids;
        String nameAsteroids;
        Scanner newScanner = new Scanner(System.in);
        numAsteroids = newScanner.nextInt();
        nameAsteroids = newScanner.next();
        System.out.println("Los " + numAsteroids + " asteroides " + nameAsteroids + " caen del cielo");
        newScanner.close();
    }
}