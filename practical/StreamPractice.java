import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(4, 3, 5, 6, 4, 10, 5, 8, 5);

        Integer res = ls.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (a, b) -> a + b);
        System.err.println(res);

        // Stream<Integer> s1 = ls.stream();
        // Stream<Integer> s2 = s1.filter(val -> val % 2 == 0);
        // // s1 is used now; can't use it again

        // s2.forEach(val -> System.err.print(val + " "));
        // // s2 is used now; can't use it again

        // List<Integer> ls = new ArrayList<Integer>();
        // for (Integer num : nums)
        // ls.add(num);

        // ls.forEach(new Consumer<Integer>() {
        // public void accept(Integer val) {
        // System.err.print(val + " ");
        // }
        // });
    }
}
