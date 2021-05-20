package exam_questions.threads;

import java.util.concurrent.*;

class Player extends Thread {
    CyclicBarrier cb;

    public Player() {
        super();
    }

    public Player(CyclicBarrier cb) {
        this.cb = cb;
        this.start();
    }

    public void run() {
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
        }
    }
}

class Match implements Runnable {
    public void run() {
        System.out.println("Match is starting...");
    }
}

public class Test4 {
    public static void main(String[] args) {
        Match match = new Match();
        CyclicBarrier cb = new CyclicBarrier(2, match);
        Player p1 = new Player(cb);
        /*INSERT*/
        //        p1.start();
        //        new Player();
        //        new Player(cb).start();//Match is starting...
        //        cb.await();
        new Player(cb); //<-

    }
}

//TODO
//    Which of the following statement, if used to replace /*INSERT*/,
//        will print 'Match is starting...'on to the console and will successfully
//        terminate the program?

//'new CyclicBarrier(2, match);' means 2 exam_questions.threads.threads must call await() so that Cyclic
// Barrier is tripped and barrier action is executed, this means run() method of thread
// referred by match is invoked and this will print expected output on to the console.
//
//
//
//'new Player(cb);' assigns passed CyclicBarrier instance to 'cb' property of the
// Player class and it also invokes start() method so that this Player thread becomes
// Runnable. run() method is invoked later which invokes cb.await() method.
//
//
//
//One more 'cb.await();' call is needed to get the expected output.
//
//
//
//'p1.start();' => Thread referred by p1 is already started in the constructor, calling
// start() again throws IllegalThreadStateException.
//
//'new Player(cb);' => Just like previous statement, it will invoke the await() method
// on cb and CyclicBarrier will be tripped. This is correct option.
//
//'new Player(cb).start();' => 'new Player(cb)' will invoke the await() method on cb
// and CyclicBarrier will be tripped. 'Match is starting...' will be printed on to the
// console. But calling start() method again throws IllegalThreadStateException and
// program is not terminated successfully.
//
//'cb.await();' => await() method throws 2 checked exceptions: InterruptedException and
// BrokenBarrierException and these are not handled in the main method. Hence this will
// cause compilation error. If these 2 exceptions are handled inside main, then this
// could be one of the correct options.
//
//'new Player();' => No-argument constructor of Player class doesn't assign value to
// 'cb' and doesn't invoke start() method as well. Hence, it will not have any affect.

