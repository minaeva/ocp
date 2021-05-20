package exam_questions.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 8);

        System.out.println(list.stream().max(Comparator.comparing(a -> a)).get());
        //Line 1 -> 20

        System.out.println(list.stream().max(Integer::compareTo).get()); //Line 2
        // -> 20

        System.out.println(list.stream().max(Integer::max).get()); //Line 3 -> 10
    }
    //Which of the following statement is true?
}
