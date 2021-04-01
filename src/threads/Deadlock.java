package threads;

public class Deadlock {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();

        Thread thread1 = new Thread(()-> runner.firstThread());
        Thread thread2 = new Thread(()-> runner.secondThread());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finished();
    }
}

class Runner {
    public void firstThread() {
    }

    public void secondThread() {
    }

    public void finished() {
    }
}
