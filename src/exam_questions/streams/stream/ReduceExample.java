package exam_questions.streams.stream;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream()
                .reduce((accumulator, element) -> accumulator * element)
                .get();
        System.out.println(result);

        int result2 = list.stream()
                .reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println(result2);


        List<String> stringList = List.of("first", "22", "333", "4444", "55555");
        String result3 = stringList.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(result3);
    }
}
