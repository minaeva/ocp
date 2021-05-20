package exam_questions.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        Deque<Character> chars = new ArrayDeque<>();
        chars.add('A');
        chars.remove();
        chars.remove();
        System.out.println(chars);
    }
    //Exception in thread "main" java.util.NoSuchElementException
    //	at java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:363)
    //	at java.base/java.util.ArrayDeque.remove(ArrayDeque.java:524)
}
