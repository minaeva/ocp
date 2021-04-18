package multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);

    Thread producer = new Thread(() -> {
        int i = 0;
        while (true) {
            try {
                arrayBlockingQueue.put(++i);
                System.out.println("Producer added " + i);
                System.out.println(arrayBlockingQueue);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    producer.start();

    Thread consumer = new Thread(() -> {
        while (true) {
            try {
                Integer j = arrayBlockingQueue.take();
                System.out.println("consumer took " + j);
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    consumer.start();
    }
}
