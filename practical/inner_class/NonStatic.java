class Outer {
    int val1 = 10;
    int val2 = 15;
    public static String name = "--- OUTER STATIC VARIABLE ---";

    class Inner {
        private int val1 = 30;

        public void display() {
            System.out.println("----------- Inner display begin -----------");
            System.out.println("Outer val1: " + Outer.this.val1);
            System.out.println("Inner val1: " + val1);
            System.out.println("Outer val2: " + val2);
            System.out.println("Outer val2 (using Outer.this): " + Outer.this.val2);
            System.out.println("------------ Inner display end ------------");
        }
    }

    public void show() {
        Inner obj = new Inner();

        System.out.println("----------- Outer show begin -----------");
        System.out.println("Inner val1: " + obj.val1); // Outer and Inner class can access each other's private members
        System.out.println("------------ Outer show end ------------");
    }
}

public class NonStatic {
    public static void main(String[] args) {
        Outer obOut = new Outer();
        obOut.show();
        Outer.Inner obIn = obOut.new Inner();
        obIn.display();
    }
}
