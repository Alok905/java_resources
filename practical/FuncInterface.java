
@FunctionalInterface
interface A {
    int add(int a, int b);
}

public class FuncInterface {
    public static void main(String[] args) {
        // if there is only single expression, no need to enclose inside {}
        // in lambda expression, no need to give the datatype; it'll take from the
        // interface

        A obj = (a, b) -> a + b;
        int res = obj.add(4, 5);
        System.out.println("Sum = " + res);
    }
}
