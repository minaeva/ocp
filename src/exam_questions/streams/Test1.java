package exam_questions.streams;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ONE");
        map.put(2, "TWO");
        map.put(3, "THREE");

        //            System.out.println(map.exam_questions.streams.stream().count());

        //There is no exam_questions.streams.stream() method available in Map interface and hence map.exam_questions.streams.stream()
        // causes compilation error.
        //
        //Though you can first get either entrySet or keySet or values and then invoke
        // exam_questions.streams.stream() method.
        //
        //For example, below code prints all the key value pairs available in the map:
        //
        //map.entrySet().exam_questions.streams.stream().forEach(x -> System.out.println(x.getKey() + ":" + x
        // .getValue()));


        map.entrySet().stream().forEach(System.out::println);
        map.keySet().stream().forEach(System.out::println);
        map.values().stream().forEach(System.out::println);

    }
}
