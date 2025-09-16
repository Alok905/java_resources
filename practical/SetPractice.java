import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<Integer>();
        int[] arr = { 62, 54, 82, 21 };

        for (int x : arr)
            st.add(x);

        for (int val : st)
            System.err.println(val);
    }
}
