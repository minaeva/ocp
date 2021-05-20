package exam_questions.lambdas.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("first", "22", "333", "4444", "55555");

//        for (String s: list) {
//            System.out.println(s);
//        }

        list.forEach(str -> System.out.println(str));

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.forEach(System.out::println);

    }
}
