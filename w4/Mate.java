package w4;

public class Mate {

    public int factorial(int num) {
        int fact = 1;
        for (int i = 2; i < num + 1; i++) {
            fact *= i;
        }

        return fact;
    }
}