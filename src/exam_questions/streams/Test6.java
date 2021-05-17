package exam_questions.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,
                10));
        list.removeIf(i -> i % 2 == 1);
        System.out.println(list);
        //[2, 4, 6, 8, 10]
        //List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)); =>
        // [1,2,3,4,5,6,7,8,9,10].
        //
        //list.removeIf(i -> i % 2 == 1); => [2,4,6,8,10]. Remove the element for which
        // passed Predicate is true.
    }
}
