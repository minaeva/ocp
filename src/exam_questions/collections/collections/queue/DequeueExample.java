package exam_questions.collections.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addLast(9);
        deque.addLast(7);
        deque.addFirst(4);

        System.out.println(deque);

        deque.offerFirst(11);
        deque.offerLast(22);
        System.out.println(deque);

        deque.removeLast();

        System.out.println("peek " + deque.peekFirst());
        System.out.println(deque);
        System.out.println("poll " + deque.pollFirst());
        System.out.println(deque);
        System.out.println("pop " + deque.pop());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        deque.pollFirst();
        System.out.println(deque);
    }
}
