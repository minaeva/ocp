package exam_questions.collections.collections.maps;

import java.util.*;

public class GetOrDefault {

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();

        Random random = new Random();

        int count = 0;
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(10));
            list2.add(random.nextInt(10));
        }

        Map<Object, Integer> map = new HashMap<>();
        for (Object obj: list1) {
            map.put(obj, map.getOrDefault(obj, 0) + 1);
        }
        for (Object obj: list2) {
            count += map.getOrDefault(obj, 0) ;
        }


    }
}
