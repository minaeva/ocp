package exam_questions.threads.threads;

import java.util.Random;

public class BreakingThreads {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            Random random = new Random();
            for (int i = 0; i < 1_000_000_000; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("thread was interrupted");
                    break;
                }
//                if (Thread.currentThread().isInterrupted()) {
//                    System.out.println("thread was interrupted");
//                    break;
//                }
                Math.sin(random.nextDouble());
            }
        });

        System.out.println("starting exam_questions.streams.stream");

        thread.start();
        Thread.sleep(1000);
        thread.interrupt();

        thread.join();

        System.out.println("thread finished");
    }
}
