package multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        queue.add(1);
        queue.add(5);
        queue.add(10);
        queue.add(15);
        queue.offer(25);
        System.out.println(queue);
    }
}
