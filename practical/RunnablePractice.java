class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println("Hi");
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println("Hello");
    }
}

public class RunnablePractice {
    public static void main(String[] a) {
        // /**
        // * Runnable bcs Thread constructor accepts Runnable
        // * We can even create with A, B in stead of Runnable,
        // * anyhow, only the "run()" will be called,
        // * so why to give a heavy object...
        // */
        // Runnable ob1 = () -> {
        // for (int i = 1; i <= 10; i++)
        // System.out.println("Hi");
        // };
        // Runnable ob2 = () -> {
        // for (int i = 1; i <= 10; i++)
        // System.out.println("Hello");
        // };
        // // A ob1 = new A(); // this is also correct
        // // B ob2 = new B(); // this is also correct

        Runnable ob1 = () -> {
            for (int i = 1; i <= 10; i++)
                System.out.println("Hi");
        };
        Runnable ob2 = () -> {
            for (int i = 1; i <= 10; i++)
                System.out.println("Hello");
        };

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();
    }
}
