package exam_questions.threads.multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial1 factorial = new Factorial1(5);
        Future<Integer> future = executorService.submit(factorial);
        try {
            System.out.println(future.isDone());
            System.out.println("Want to get the result");
            factorialResult = future.get();
            System.out.println("Got the result");
            System.out.println(future.isDone());
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial1 implements Callable<Integer> {
    int f;

    public Factorial1(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f < 0) {
            throw new Exception("wrong number");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}

