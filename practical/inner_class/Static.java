class Outer {
    int v1 = 10;
    static int s1 = 20;
    static int s2 = 25;

    static class Inner {
        private static int s1 = 30;

        public void display() {
            System.out.println("----------- Inner display begin -----------");
            // System.out.println("Outer v1: " + v1); // can't access instance variables
            System.out.println("Outer s1: " + Outer.s1);
            System.out.println("Inner s1: " + s1);
            System.out.println("Outer s2: " + s2);
            System.out.println("Outer s2 (using Outer): " + Outer.s2);
            System.out.println("------------ Inner display end ------------");
        }
    }

    public void show() {
        System.out.println("----------- Outer show begin -----------");
        System.out.println("Inner val1: " + Inner.s1); // Outer and Inner class can access each other's private members
        System.out.println("------------ Outer show end ------------");
    }
}

public class Static {
    public static void main(String[] args) {
        Outer obOut = new Outer();
        obOut.show();

        Outer.Inner obIn = new Outer.Inner();
        obIn.display();
    }
}
