class Test {
    int a;
    static int count;
    static {
        count = 5;
        System.out.println("Static block called");
    }

    public Test(int a) {
        this.a = a;
        System.out.println("Constructor called");
    }

    public static void statMethod() {
        System.out.println("Static method called");
    }
}

public class Demo {
    public static void main(String[] args) {
        Class.forName("Test");
    }
}
