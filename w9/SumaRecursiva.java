package w9;

public class SumaRecursiva {

    public int sumaRecursiva(int i) {
        if (i == 1) {
            return 1;
        }
        return (sumaRecursiva(i - 1) + i);
    }
}
