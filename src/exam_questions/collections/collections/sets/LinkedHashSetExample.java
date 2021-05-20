package exam_questions.collections.collections.sets;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(7);
        set.add(3);
        set.add(9);
        set.add(1);
        set.add(11);

        System.out.println(set);

        set.remove(11);
        System.out.println(set.contains(11));
    }
}
