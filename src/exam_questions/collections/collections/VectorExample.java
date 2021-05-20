package exam_questions.collections.collections;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Sveta");
        vector.add("Tonya");
        vector.add("Varya");
        vector.add("Lena");

        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.get(1));
        vector.remove(3);
        System.out.println(vector);
    }
}
