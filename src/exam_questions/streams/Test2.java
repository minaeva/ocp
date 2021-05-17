package exam_questions.streams;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        String[] cities = {"Seoul", "Tokyo", "Paris", "London", "Hong Kong", "Singapore"};
        Arrays.stream(cities)
                .sorted((s1, s2) -> s2.compareTo(s1))
                //                    .sorted(Comparator.reverseOrder()) //<- the same
                .forEach(System.out::println);
    }
}
