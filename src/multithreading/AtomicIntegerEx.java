package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {

    static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        MyRunnableImpl8 runnableImpl8 = new MyRunnableImpl8();
        Thread thread1 = new Thread(runnableImpl8);
        Thread thread2 = new Thread(runnableImpl8);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(atomicInteger);
    }

    public static void increment() {
        atomicInteger.getAndIncrement();
    }
}

class MyRunnableImpl8 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            AtomicIntegerEx.increment();
        }
    }
}
