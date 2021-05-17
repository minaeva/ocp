package exam_questions.streams;

import java.util.stream.IntStream;

public class Test10 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 3).map(i -> i * i).map(i -> i * i).sum();
        System.out.println(sum);
    }
    //98

    //IntStream.rangeClosed(1,3) => [1,2,3].
    //map(i -> i * i) => [1,4,9].
    //map(i -> i * i) => [1,16,81].
    //sum() => 1+16+81 = 98.
}
