package exam_questions.threads.threads;

import java.util.Random;
import java.util.concurrent.*;

public class CallableFuture {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
      /*  executorService.submit(() -> {
            System.out.println("Start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");
        });*/

        /*executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Start");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished");
                Random random = new Random();

                return random.nextInt(10);
            }
        });*/

        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Start");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");
            Random random = new Random();
            int randomValue = random.nextInt();
            if (randomValue < 5)
                throw new Exception("something bad message");
            return random.nextInt(10);
        });
        executorService.shutdown();

        int result = 0;
        try {
            result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
//            e.printStackTrace();
        }
    }

    public static int calculate() {
        return 5 + 4;
    }
}
