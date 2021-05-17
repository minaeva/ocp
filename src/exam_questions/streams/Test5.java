package exam_questions.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test5 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, i -> i + 1);
//       List<Integer> list = stream.collect(Collectors.toList());

        System.out.println(stream.anyMatch(i -> i > 1)); //true
        //stream => {1, 2, 3, 4, 5, ... }. It is an infinite stream.
        //
        //Predicate 'i -> i > 1' returns true for any Integer greater than 1.
        //
        //As 2 > 1, so true is printed and operation is terminated.
        // Code doesn't run infinitely.
        //
        //NOTE:
        // 'stream.allMatch(i -> i > 1)' returns false
        // as 1st element of the stream (1) returns false for the predicate
        // 'stream.noneMatch(i -> i > 1)' returns false
        // as 2nd element of the stream (2) returns true for the predicate.
    }
}
