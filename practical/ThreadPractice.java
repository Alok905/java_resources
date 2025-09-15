class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.err.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.err.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPractice {
    public static void main(String[] a) {
        A ob1 = new A();
        B ob2 = new B();
        ob1.setPriority(Thread.MAX_PRIORITY);

        ob1.start();
        ob2.start();
    }
}
