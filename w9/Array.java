package w9;

public class Array {

    public static void transpuesta(int[][] arr) {
        int[][] transpose = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transpose[i][j] = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(transpose[j][i]);
            }
        }
    }
}
