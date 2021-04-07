package multithreading;

public class Volatile extends Thread {
    volatile boolean b = true;

    public static void main(String[] args) throws InterruptedException {
        Volatile thread = new Volatile();
        thread.start();
        Thread.sleep(3000);
        System.out.println("In 3 seconds it's time to wake up");
        thread.b = false;
        thread.join();
        System.out.println("End");
    }

    public void run() {
        long counter = 0;
        while (b == true) {
            counter++;
        }
        System.out.println("Finish. Counter = " + counter);
    }
}
