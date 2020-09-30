package w1;

import java.util.Scanner;

public class FriendZone {
    public static void main(String[] args) {
        String nameOne, nameTwo;
        Scanner newScanner = new Scanner(System.in);
        nameOne = newScanner.next();
        nameTwo = newScanner.next();
        System.out.println(nameOne + " deja en la friend zone a " + nameTwo);
        newScanner.close();
    }
}
