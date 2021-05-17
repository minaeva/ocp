package exam_questions.collections;

import java.util.Map;
import java.util.TreeMap;

public class Test6 {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
//        map.put(null, "null"); //-> NPE
        map.forEach((key, value) -> System.out.println("{" + key + ": " + value + "}"));
    }
}
