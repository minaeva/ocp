package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolScheduled {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
//        executorService.schedule(new RunnableImpl6(), 3, TimeUnit.SECONDS);

//        executorService.scheduleAtFixedRate(new RunnableImpl6(), 3, 1, TimeUnit.SECONDS); //from start to start is fixed
//        executorService.scheduleWithFixedDelay(new RunnableImpl6(), 3, 1, TimeUnit.SECONDS); //gap is fixed

        Thread.sleep(10000);
        executorService.shutdown();
        System.out.println("main ends");

        ExecutorService executorService1 = Executors.newCachedThreadPool();
    }
}

class RunnableImpl6 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + " ends");

    }
}
