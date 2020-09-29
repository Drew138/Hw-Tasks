public class ExcepcionSuma {
    public static int suma(int[] a) {

        int sum = 0;
        boolean isInterval = false;
        for (int i = 0; i < a.length; i++) {
            boolean isSixOrSeven = (a[i] == 6) || (a[i] == 7);
            if (isInterval && isSixOrSeven) {
                isInterval = false;
            } else if (!isInterval && isSixOrSeven) {
                isInterval = true;
            } else if (!isInterval) {
                sum += a[i];
            }
        }
        return sum;
    }

}
