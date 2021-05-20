package exam_questions.collections.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("zaur");
        queue.offer("oleg");
        queue.offer("ivan");
        queue.offer("masha");
        queue.offer("sasha");

        System.out.println(queue);
        System.out.println("element " + queue.element());

        System.out.println(queue.remove());
        System.out.println("element " + queue.element());
        System.out.println(queue.remove());
        System.out.println("element " + queue.element());
        System.out.println(queue.remove());
        System.out.println("element " + queue.element());
        System.out.println(queue.remove());
        System.out.println("element " + queue.element());
//        System.out.println(queue.remove());//throws the exception
        System.out.println(queue.poll());//does not throw the exception
        System.out.println("element " + queue.element());
        System.out.println(queue.poll());
//        System.out.println("element " + queue.element()); //throws exception
        System.out.println("element " + queue.peek()); //does not throw exception
        System.out.println("asd/*/**/*/");
    }
}
