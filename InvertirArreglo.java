public class InvertirArreglo {
    public static int[] invertir(int[] a) {
        int j = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            int b = a[i];
            a[i] = a[j];
            a[j] = b;
            j--;
        }
        return a;
    }

    public static void imprimir(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
