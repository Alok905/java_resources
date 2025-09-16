import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        return -1;
    }
}

public class Sorting {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(21, "Alice"));
        students.add(new Student(19, "Bob"));
        students.add(new Student(22, "Charlie"));
        students.add(new Student(20, "Diana"));

        for (Student st : students)
            System.err.println(st);

        System.err.println();

        Collections.sort(students);

        // Collections.sort(students, (a, b) -> a.age - b.age);

        for (Student st : students)
            System.err.println(st);

        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(43);
        // nums.add(31);
        // nums.add(72);
        // nums.add(29);

        // System.err.println(nums);

        // Collections.sort(nums, (v1, v2) -> (v1 % 10) - (v2 % 10)); // [31, 72, 43,
        // 29]

        // System.err.println(nums);
    }
}
