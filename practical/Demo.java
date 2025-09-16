import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class Demo {
    public static void main(String[] args) {
        // List<String> names = Arrays.asList("Alok", "Laxmi", "Ram", "Hari");

        // List<Student> students = new ArrayList<Student>();

        // students = names.stream()
        // .map(Student::new)
        // .toList();

        // System.err.println(students);

        Supplier<List<Integer>> sp1 = new Supplier<List<Integer>>() {
            public List<Integer> get() {
                return new ArrayList<Integer>();
            }
        };

        Supplier<List<Integer>> sp2 = ArrayList<Integer>::new;

        List<Integer> ls1 = sp2.get();
        List<Integer> ls2 = sp2.get();
        System.err.println("ls1 = " + ls1);
        System.err.println("ls2 = " + ls2);
    }
}
