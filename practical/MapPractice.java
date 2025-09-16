import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Alok", 24);
        students.put("Kanha", 28);
        students.put("Ram", 30);

        System.err.println(students); // {Alok=24, Kanha=28, Ram=30}
        System.err.println(students.get("Alok")); // 24

        for (String key : students.keySet())
            System.err.print(key + " "); // Alok Kanha Ram
        System.err.println();

        for (int value : students.values())
            System.err.print(value + " "); // 24 28 30
        System.err.println("\n");

        for (String key : students.keySet())
            System.err.println(key + " : " + students.get(key));
        // Alok : 24
        // Kanha : 28
        // Ram : 30

    }
}
