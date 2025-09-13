class Student {
    int rollno, marks;
    String name;

    Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 95);
        Student s2 = new Student(102, "Bob", 85);
        Student s3 = new Student(103, "Charlie", 75);
        Student[] students = { s1, s2, s3 };
        for (Student s : students)
            System.out.println("Student " + s.rollno + ": " + s.name + ", " + s.marks);
    }
}
