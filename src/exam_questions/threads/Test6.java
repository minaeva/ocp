package exam_questions.threads;

import java.util.concurrent.*;

class Printer implements Runnable {
    public void run() {
        System.out.println("Printing");
    }
}

public class Test6 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        /*INSERT*/
//        es.start(new Printer());//NO
//        es.run(new Printer());//NO
        es.execute(new Printer());//YES
        es.submit(new Printer());//YES
        es.shutdown();
    }

    //Which of the following statements, if used to replace /*INSERT*/, will print
    // 'Printing' on to the console?
    //
    //Select 2 options.
}
