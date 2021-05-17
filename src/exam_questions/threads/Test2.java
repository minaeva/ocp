package exam_questions.threads;

import java.util.concurrent.*;

class MyThread implements Runnable {
    private String str;

    MyThread(String str) {
        this.str = str;
    }

    public void run() {
        System.out.println(str.toUpperCase());
    }
}

public class Test2 {
    public static void main(String[] args) throws ExecutionException,
            InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();
        MyThread thread = new MyThread("ocp");
        Future future = es.submit(thread);
        Integer tmp = (Integer) future.get(); //Line 22
        System.out.println(tmp);
        es.shutdown();
    }
    //OCP
    //null


    //get() method throws 2 checked exceptions: InterruptedException and
    // ExecutionException. And future.get() returns Object and it can be type-casted to
    // Integer, so no compilation error.
    //
    //run() method of MyThread prints 'OCP' on to the console and doesn't return
    // anything, hence get() method of Future object returns null. null can be easily
    // assigned to Integer.
    //
    //Hence 'System.out.println(tmp);' prints null on to the console.
}
