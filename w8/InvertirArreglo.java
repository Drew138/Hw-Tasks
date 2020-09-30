package w8;

public class InvertirArreglo {
    public static int[] invertir(int[] a) {
        int[] newArr = new int[a.length];
        int x = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            newArr[x] = a[i];
            x++;
        }

        return newArr;
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
