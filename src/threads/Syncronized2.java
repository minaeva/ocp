package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Syncronized2 {

    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }
}


class Worker {
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToListOne() {
        synchronized (lock1) {
            list1.add(random.nextInt(100));
        }
    }

    public void addToListTwo() {
        synchronized (lock2) {
            list2.add(random.nextInt(100));
        }
    }

    public void work() {
        for (int i = 0; i < 100000; i++) {
            addToListOne();
            addToListTwo();
        }
    }

    public void main() throws InterruptedException {
        long before = System.currentTimeMillis();
//            work();
        Thread thread1 = new Thread(() -> work());
        Thread thread2 = new Thread(() -> work());
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        long after = System.currentTimeMillis();

        System.out.println("Program took " + (after - before + " ms"));
        System.out.println("List1: " + list1.size());
        System.out.println("List2: " + list2.size());
    }
}
