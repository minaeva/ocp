package collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Map<Double, Student> map = new LinkedHashMap<>();

        Student student1 = new Student("Svet", "S", 1);
        Student student2 = new Student("Svet", "B", 2);
        Student student3 = new Student("Olye", "O", 3);
        Student student4 = new Student("Alex", "A", 4);
        Student student5 = new Student("Lena", "D", 1);
        Student student6 = new Student("Denis", "F", 2);

        map.put(5.6, student1);
        map.put(16.6, student2);
        map.put(9.6, student3);
        map.put(13.6, student4);
        map.put(20.6, student5);
        map.put(26.6, student6);

        System.out.println(map);


        LinkedHashMap<Double, Student> map2 =
                new java.util.LinkedHashMap(16, 0.75f, true);
        map2.put(1.1, student1);
        map2.put(3.3, student3);
        map2.put(2.2, student2);
        map2.put(4.4, student4);
        map2.put(5.5, student5);

        System.out.println(map2);

        System.out.println(map2.get(2.2));
        System.out.println(map2.get(3.3));//printed out last

        System.out.println(map2);
    }
}
