package w8;

import java.util.HashSet;

public class ConjuntosExternosInternos {
    public static boolean verificador(int[] externo, int[] interno) {
        HashSet<Integer> map = new HashSet<Integer>();
        for (int i = 0; i < externo.length; i++) {
            map.add(externo[i]);
        }
        boolean isContained = true;
        for (int j = 0; j < interno.length; j++) {
            if (!isContained) {
                break;
            } else {
                isContained = map.contains(interno[j]);
            }
        }
        return isContained;
    }
}
