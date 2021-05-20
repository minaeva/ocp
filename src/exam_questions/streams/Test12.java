package exam_questions.streams;

import java.util.ArrayList;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.stream().anyMatch(s -> s.length() > 0));
        System.out.println(list.stream().allMatch(s -> s.length() > 0));
        System.out.println(list.stream().noneMatch(s -> s.length() > 0));
    }
    //false
    //true
    //true

    //Method signatures:
    //
    //boolean anyMatch(Predicate<? super T>) : Returns true if any of the exam_questions.streams.stream
    // element matches the given Predicate. If exam_questions.streams.stream is empty, it returns false and
    // predicate is not evaluated.
    //
    //boolean allMatch(Predicate<? super T>) : Returns true if all the exam_questions.streams.stream elements
    // match the given Predicate. If exam_questions.streams.stream is empty, it returns true and predicate is
    // not evaluated.
    //
    //boolean noneMatch(Predicate<? super T>) : Returns true if none of the exam_questions.streams.stream
    // element matches the given Predicate. If exam_questions.streams.stream is empty, it returns true and
    // predicate is not evaluated.
    //
    //In this case, as exam_questions.streams.stream is empty anyMatch returns false, whereas allMatch and
    // noneMatch both returns true.
}
