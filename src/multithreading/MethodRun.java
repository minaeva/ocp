package multithreading;

public class MethodRun implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new MethodRun());
//        thread.run();
        thread.start();
        System.out.println("MAIN thread name = " +
                Thread.currentThread().getName());
    }

    public void run() {
        System.out.println("RUN thread name = " +
                Thread.currentThread().getName());
    }
}
