package exam_questions.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Test7 {

    public static void main(String[] args) {
//        Integer.stringSize(23);

        List<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2.0);
        list.add(3L);
        System.out.println(list);
        int sum = IntStream.range(0, 101)
                .parallel()
                .reduce(0, (e1, e2) -> {
                    System.out.println("e1 " + e1);
                    System.out.println("e2 " + e2);
                    return e1 - e2;
                } );

        System.out.println(sum);
    }
}
