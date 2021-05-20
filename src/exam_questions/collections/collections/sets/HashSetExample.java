package exam_questions.collections.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Ann");
        set.add("Inna");
        set.add("Mary");
        set.add("Ann");
        set.add(null);

        System.out.println(set);

        set.remove("Inna");
        System.out.println(set);
        System.out.println(set.size());

        System.out.println(set.contains("1"));
        System.out.println(set.hashCode());

        set.clear();
        System.out.println(set.isEmpty());
    }
}
