class Outer {
    int v1 = 10;
    int v2 = 20;

    public void show() {
        class Inner {
            private int v1 = 25;

            public void display() {
                System.out.println("----------- Inner display begin -----------");
                System.out.println("Outer v1: " + Outer.this.v1);
                System.out.println("Inner v1: " + v1);
                System.out.println("Outer v2: " + v2);
                System.out.println("Inner v1 (using this): " + this.v1);
                System.out.println("------------ Inner display end ------------");
            }
        }
        Inner obj = new Inner();
        // Outer class and Inner class can access eachother's private members
        System.out.println("accessing Inner's v1 from show() method: " + obj.v1);
        obj.display();
    }
}

public class Local {
    public static void main(String[] args) {
        Outer ob = new Outer();
        ob.show();
    }
}
