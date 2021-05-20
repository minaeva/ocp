package exam_questions.streams.stream;

import java.util.stream.Stream;

public class ConcatEx {
    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 8);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10, 5);

        Stream<Integer> stream3 = Stream.concat(stream1, stream2); //not terminal, not intermediate
        stream3.forEach(System.out::println);
    }
}
