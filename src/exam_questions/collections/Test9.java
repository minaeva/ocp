package exam_questions.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test9 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Melon");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Mango");
        List<String> list2 = new CopyOnWriteArrayList<>(list1);
        for (String s : list2) {
            if (s.startsWith("M")) {
                list2.remove(s);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
    }
}
