package exam_questions.lambdas;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Test5 {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        BiConsumer<Integer, String> consumer = map::putIfAbsent;
        consumer.accept(1, null);
        consumer.accept(2, "two");
        consumer.accept(1, "ONE");
        consumer.accept(2, "TWO");

        System.out.println(map);
        //{1=ONE, 2=two}
    }

    //consumer.accept(1, null); => {1=null}.
    //consumer.accept(2, "two"); => {1=null, 2=two}.
    //consumer.accept(1, "ONE"); => {1=ONE, 2=two}. putIfAbsent method replaces null
    // value with the new value.
    //consumer.accept(2, "TWO"); => {1=ONE, 2=two}. As value is available against '2',
    // hence value is not replaced.
}
