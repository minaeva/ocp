package multithreading;

public class InterruptionExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();

        Thread.sleep(3000);
        thread.interrupt();
        thread.join();

        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i < 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("isInterrupted");
                System.out.println("i is " + i + " sqrt now is " + sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);

            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("interruption in sleep, let's finish");
                System.out.println("i is " + i + " sqrt now is " + sqrtSum);
                return;
            }

        }
        System.out.println(sqrtSum);
    }
}
