package exam_questions.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test2 {
    public static void main(String[] args) {
        Deque<Boolean> deque = new ArrayDeque<>();
        deque.push(new Boolean("abc")); //false deque = [false]
        deque.push(new Boolean("tRuE")); //true deque = [true, false]
        deque.push(new Boolean("FALSE")); //false deque = [false, true, false]
        deque.push(true); //deque = [true, false, true, false]
        System.out.println(deque.pop() + ":" + deque.peek() + ":" + deque.size());
        //true:false:3

        // push(E) calls addFirst(E),
        // pop() calls removeFirst() and
        // peek() invokes peekFirst(),
        // it just retrieves the first element (HEAD) but doesn't remove it.


        //public static boolean parseBoolean(String s) {
        //        return "true".equalsIgnoreCase(s);
        //    }
    }
}
