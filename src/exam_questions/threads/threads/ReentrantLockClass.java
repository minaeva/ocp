package exam_questions.threads.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockClass {

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();

        Thread thread1 = new Thread(() -> task.firstThread());
        Thread thread2 = new Thread(() -> task.secondThread());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        task.showCounter();
    }

}

class Task {
    private int counter;
    private Lock lock = new ReentrantLock();

    private void increment() {
        counter++;
    }

    public void firstThread() {
        lock.lock();
        for (int i = 0; i < 1000; i++)
            increment();
        lock.unlock();
    }

    public void secondThread() {
//        lock.lock();
        for (int i = 0; i < 1000; i++)
            increment();
//        lock.unlock();
    }

    public void showCounter() {
        System.out.println("Counter: " + counter);
    }
}
