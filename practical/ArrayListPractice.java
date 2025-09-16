import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++)
            nums.add(i);

        for (int i = 0; i <= nums.size(); i++)
            nums.get(i);
    }
}