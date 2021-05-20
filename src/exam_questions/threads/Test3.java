package exam_questions.threads;

import java.util.concurrent.atomic.AtomicInteger;

class Counter implements Runnable {
    private static AtomicInteger ai = new AtomicInteger(3);

    public void run() {
        System.out.print(ai.getAndDecrement());
    }
}

public class Test3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter());
        Thread t2 = new Thread(new Counter());
        Thread t3 = new Thread(new Counter());
        Thread[] threads = {t1, t2, t3};
        for (Thread thread : threads) {
            thread.start();
        }

        //321 or 312

        //AtomicInteger's getAndDecrement() method will first retrieve the value and
        // then decrement and it happens atomically.
        //
        //So during the execution of getAndDecrement() method, another thread cannot
        // execute getAndDecrement() method. This means output will have 3 digits 3, 2
        // and 1.
        //
        //
        //
        //But execution of exam_questions.threads.threads depend on OS/JVM implementation, hence order of
        // output can be different.
    }
}
