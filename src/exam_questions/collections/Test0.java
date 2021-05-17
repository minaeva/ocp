package exam_questions.collections;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Test0 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("T", "S", "R", "I", "F");
        ListIterator<String> iter = list.listIterator(2);
        while (iter.hasNext()) {
            System.out.print(iter.next()); //RIF (2-3-4)
        }

        //listIterator(index); method allows to have the starting point at any index.
        // Allowed values are between 0 and size of the list.
    }
}
