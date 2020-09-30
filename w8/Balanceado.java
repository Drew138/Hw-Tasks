package w8;

public class Balanceado {
    public static boolean balancear(int[] a) {
        int middlePoint = (a.length + 1) / 2;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < middlePoint - 1; i++) {
            sumLeft += a[i];
        }
        for (int x = middlePoint; x < a.length; x++) {
            sumRight += a[x];
        }
        return (sumLeft == sumRight);
    }
}
