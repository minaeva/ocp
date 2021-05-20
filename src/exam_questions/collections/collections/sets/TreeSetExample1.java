package exam_questions.collections.collections.sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(9);
        set.add(2);
        set.add(4);
        set.add(0);
//        set.add(null);

        System.out.println(set);

        set.remove(0);
        System.out.println(set);
        System.out.println(set.contains(1));

    }
}
