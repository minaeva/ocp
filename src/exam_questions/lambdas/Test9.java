package exam_questions.lambdas;

import java.util.function.Consumer;

public class Test9 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::print;
        Integer i = 5;
        consumer.andThen(consumer).accept(i++); //Line 7 //55

        //the same as
        //        consumer.accept(i); //5
        //        consumer.accept(i++); //5
    }
}
