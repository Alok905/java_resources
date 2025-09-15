class Counter {
    int count;

    Counter() {
        this.count = 0;
    }

    public synchronized void increment() {
        this.count++;
    }
}

public class RacePractice {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable ob1 = () -> {
            for (int i = 1; i <= 50000; i++)
                c.increment();
        };
        Runnable ob2 = () -> {
            for (int i = 1; i <= 50000; i++)
                c.increment();
        };

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.err.println(c.count);
    }
}
