package exam_questions.threads.multithreading;

public class DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread10: trying to get lock1's monitor");
        synchronized (DeadLock.lock1) {
            System.out.println("Thread10: lock1's monitor is caught");
            System.out.println("Thread10: trying to get lock2's monitor");

            synchronized (DeadLock.lock2) {
                System.out.println("Thread10: lock1 and lock2's monitors are caught");
            }
        }
    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: trying to get lock2's monitor");
        synchronized (DeadLock.lock2) {
            System.out.println("Thread20: lock2's monitor is caught");
            System.out.println("Thread20: trying to get lock1's monitor");

            synchronized (DeadLock.lock1) {
                System.out.println("Thread10: lock1 and lock2's monitors are caught");
            }
        }
    }
}
