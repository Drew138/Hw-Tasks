package w8;

public class SubArregloImpar {
    public static int[] subArreglo(int[] a) {

        int numOdd = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] % 2) == 1) {
                numOdd++;
            }
        }
        int[] arr = new int[numOdd];
        int ind = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] % 2) == 1) {
                arr[ind] = a[i];
                ind++;
            }
        }
        return arr;
    }

    public static void imprimir(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == (a.length - 1)) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ",");
            }
        }
    }
}
