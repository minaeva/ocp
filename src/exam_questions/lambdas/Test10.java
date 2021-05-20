package exam_questions.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface StringConsumer extends Consumer<String> {
    @Override
    public default void accept(String s) {
        System.out.println(s.toUpperCase());
    }
}

public class Test10 {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toLowerCase()); //ok
//        StringConsumer consumer = s -> System.out.println(s.toLowerCase()); //compile
        // error
        List<String> list = Arrays.asList("Dr", "Mr", "Miss", "Mrs");
        list.forEach(consumer);
    }
    //StringConsumer is not a Functional Interface as it just specifies one default
    // method, abstract method is not available.
}
