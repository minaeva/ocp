package exam_questions.generics;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<? super String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
//        for (String str : list) {
//            System.out.print(str);
//        }
    }
    //compilation error

    //For 'List<? super String>' type of read objects is 'Object' and type of write
    // objects is 'String' and its subclasses (no subclass of String as String is final).
    //
    //
    //
    //'for(String str : list)' causes compilation failure.
    //
    //Correct syntax should be: 'for(Object str : list)'
}
