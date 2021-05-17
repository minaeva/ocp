package exam_questions.streams;

import java.util.stream.IntStream;

public class Test9 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).parallel().forEachOrdered(System.out::println);
    }
} //1 ... 10

//IntStream.rangeClosed(1, 10) returns a sequential ordered IntStream but parallel()
// method converts it to a parallel stream.
//
//forEachOrdered() will processes the elements of the stream in the order specified by
// its source (Encounter order), regardless of whether the stream is sequential or
// parallel, hence given code prints 1 to 10 in ascending order.
