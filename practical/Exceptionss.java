class A {
    public void showA() throws ClassNotFoundException {
        Class.forName("NoClass");
    }
}

class B {
    public void showB() throws ClassNotFoundException {
        A obj = new A();
        obj.showA();
    }
}

class C {
    public void showC() throws ClassNotFoundException {
        B obj = new B();
        obj.showB();
    }
}

public class Exceptionss {
    public static void main(String[] args) {
        C obj = new C();

        try {
            obj.showC();
            System.err.println("Class found!");
        } catch (ClassNotFoundException e) {
            System.err.println("Not able to find the class; ");
            e.printStackTrace();
        }
    }
}
