package exam_questions.collections;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test0 {
    public static void main(String[] args) {
        Collections.emptyList();
        BigInteger b = BigInteger.ONE;
        Boolean.valueOf("");
        IntStream.range(1, 11)
                .map( e -> e*2)
                .forEach(System.out::println);

//        Stream.generate(() -> 3)
//                .forEach(System.out::println);

        List<String> list = Arrays.asList("T", "S", "R", "I", "F");
        ListIterator<String> iter = list.listIterator(2);
        while (iter.hasNext()) {
            System.out.print(iter.next()); //RIF (2-3-4)
        }

        //listIterator(index); method allows to have the starting point at any index.
        // Allowed values are between 0 and size of the list.
    }
}
