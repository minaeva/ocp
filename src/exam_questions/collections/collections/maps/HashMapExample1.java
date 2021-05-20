package exam_questions.collections.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Sveta");
        map1.put(1010, "Vera");
        map1.put(1100, "Olya");
        map1.put(1001, "Olya");
        map1.put(99, "Lena");
        map1.put(99, "Sasha");
        map1.putIfAbsent(99, "NEW");
        map1.put(null, "Null");

        System.out.println(map1);
//        System.out.println(map1.get(990));
        System.out.println(map1.containsValue("Null"));
        System.out.println(map1.containsKey(null));
        map1.remove(null);
        System.out.println(map1);
        System.out.println(map1.containsKey(null));

        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
