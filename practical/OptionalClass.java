import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alok", "Laxmi", "Ram", "Hari");

        Optional<String> name = names.stream().filter(str -> str.contains("x"))
                .findFirst();
        System.err.println(name.orElse("Not found!"));

        // same only; findFirst() returns a object of tyoe "Optional"
        String name2 = names.stream().filter(str -> str.contains("x"))
                .findFirst().orElse("Not Found");
        System.err.println(name2);
    }
}