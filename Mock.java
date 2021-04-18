import java.util.ArrayList;
import java.util.Arrays;

public class Mock {
    public static void main(String[] args) {
        Mock m = new Mock();
        m.mistery();
    }

    public void mistery() {
        Integer[] a = { 7, 8, 3, 1, 2, 1, 3, 8, 9 };
        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(a));
        System.out.println(mistery1(s, a));
    }

    public String mistery1(ArrayList<Integer> s, Integer[] a) {
        ArrayList<Integer> sol = new ArrayList<>();
        mistery2(sol, s, a);
        return sol.toString();
    }

    public void mistery2(ArrayList<Integer> sol, ArrayList<Integer> s, Integer[] a) {
        for (int ele : s) {
            if (!sol.contains(ele)) {
                sol.add(ele);
            }
        }
    }
}
