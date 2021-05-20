package exam_questions.threads;

import java.util.concurrent.*;

class Printer2 implements Callable<String> {
    public String call() {
        System.out.println("DONE");
        return null;
    }
}

public class Test1 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        es.submit(new Printer2());
        System.out.println("HELLO");
        es.shutdown();
    }

    //'es.submit(new Printer());' is asynchronous call, hence 2 exam_questions.threads.threads(main and thread
    // from pool) always run in asynchronous mode.
    //
    //Thread execution depends upon underlying OS/JVM's thread scheduling mechanism.
    //
    //HELLO and DONE will be printed but their order cannot be predicted.
}
