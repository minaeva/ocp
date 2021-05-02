package stream;

import java.util.stream.Stream;

public class DistinctEx {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 5, 3, 4, 2, 5, 8, 1);

//        stream.distinct().forEach(System.out::println);
//        System.out.println(stream.count());
        System.out.println(stream.distinct().peek(System.out::println).count());

    }
}
