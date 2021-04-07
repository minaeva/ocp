package multithreading;

/*
* new -> runnable -> terminated
*        |      |
*      ready || running
* */

public class SleepTwoThreads extends Thread {
    public static void main(String[] args) throws InterruptedException {
 /*       Thread thread1 = new Thread(new MyRunnable());
        SleepTwoThreads thread2 = new SleepTwoThreads();

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
*/
        System.out.println("main: worker will start now");

        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());
        System.out.println("main: worker has just ended");

    }

    public void run() {
        for (int i = 3; i > 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 5; i > 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class Worker implements Runnable {
    public void run() {
        System.out.println("work started");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("work ended");
    }
}
