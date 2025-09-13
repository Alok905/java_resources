class Calculator {
    int num = 5; // instance variable

    public int add(int a, int b) { // local variable
        System.out.println(num);
        return a + b;
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int r1 = calc.add(5, 6);
        System.out.println("Sum is: " + r1);
    }
}
