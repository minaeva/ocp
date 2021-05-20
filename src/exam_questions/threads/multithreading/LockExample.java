package exam_questions.threads.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(() -> call.mobileCall());
        Thread thread2 = new Thread(() -> call.skypeCall());
        Thread thread3 = new Thread(() -> call.telegramCall());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    private Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(4000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void telegramCall() {
        lock.lock();
        try {
            System.out.println("Telegram call starts");
            Thread.sleep(5000);
            System.out.println("Telegram call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
