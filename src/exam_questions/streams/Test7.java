package exam_questions.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-80, 100, -40, 25, 200);
        Predicate<Integer> predicate = num -> {
            int ctr = 1;
            boolean result = num > 0;
            System.out.print(ctr++ + "."); //1.1.
            return result;
        };

        list.stream().filter(predicate).findFirst();

        //findFirst() is terminal operation.
        //
        //list.stream() => [-80, 100, -40, 25, 200].
        //
        //filter(predicate) is executed for each element until just one element passes
        // the test. Because findFirst() will terminate the operation on finding first
        // matching element.
        //
        //NOTE: a new instance of Predicate is used, hence every time ctr will be
        // initialize to 1.

        //For -80, Output is '1.' but predicate returns false, hence findFirst()
        // doesn't terminate the operation.
        //
        //For 100, '1.' is appended to previous output, so on console you will see '1.1
        // .' and predicate returns true, hence findFirst() finds an element and
        // terminates the operation.
    }
}
