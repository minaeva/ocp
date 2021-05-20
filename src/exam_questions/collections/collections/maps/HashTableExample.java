package exam_questions.collections.collections.maps;

import java.util.Hashtable;

public class HashTableExample {

    public static void main(String[] args) {
        Hashtable<Integer, Student> map = new Hashtable<>();

        Student student1 = new Student("Svet", "S", 1);
        Student student2 = new Student("Svet", "B", 2);
        Student student3 = new Student("Olye", "O", 3);
        Student student4 = new Student("Alex", "A", 4);

        map.put(1, student1);
        map.put(2, student2);
        map.put(3, student3);
        map.put(4, student4);
//        map.put(null, student4);
//        map.put(5, null);

        System.out.println(map);
    }
}
