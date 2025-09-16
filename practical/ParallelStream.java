import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        int size = 10_000; // just to make it eye catching
        List<Integer> nums = new ArrayList<Integer>(size);
        Random ran = new Random();
        for (int i = 1; i <= size; i++)
            nums.add(ran.nextInt(100));

        long t1 = System.currentTimeMillis();
        int sum1 = nums.stream()
                .map(n -> {
                    try {
                        Thread.sleep(3);
                    } catch (Exception e) {
                    }
                    return n * 2;
                })
                .reduce(0, (a, b) -> a + b);
        long t2 = System.currentTimeMillis();
        int sum2 = nums.parallelStream()
                .map(n -> {
                    try {
                        Thread.sleep(3);
                    } catch (Exception e) {
                    }
                    return n * 2;
                })
                .reduce(0, (a, b) -> a + b);
        long t3 = System.currentTimeMillis();

        System.err.println("sum1 = " + sum1 + ", sum2 = " + sum2);
        System.err.println("stream : " + (long) (t2 - t1));
        System.err.println("parallelStream : " + (long) (t3 - t2));
    }
}
