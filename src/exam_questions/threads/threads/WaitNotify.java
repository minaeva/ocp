package exam_questions.threads.threads;

import java.util.LinkedList;
import java.util.Queue;

public class WaitNotify {

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer wn = new ProducerConsumer();
        Thread thread1 = new Thread(() -> {
            try {
                wn.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                wn.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

}

class ProducerConsumer {
    private final int LIMIT = 10;
    private Queue<Integer> queue = new LinkedList<>();
    private Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while (queue.size() == LIMIT) {
                    lock.wait();
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0) {
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println(value + " size = " + queue.size());
                lock.notify();
            }
        }
    }
}
