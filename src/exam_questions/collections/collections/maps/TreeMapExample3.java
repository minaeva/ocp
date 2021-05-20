package exam_questions.collections.collections.maps;

import java.util.TreeMap;

public class TreeMapExample3 {

    public static void main(String[] args) {
        TreeMap<Double, Student> map = new TreeMap<>();
        Student student1 = new Student("Sveta", "Minaeva", 1);
        Student student2 = new Student("Sveta", "Bezsmertna", 2);
        Student student3 = new Student("Olye", "Minaeva", 3);
        Student student4 = new Student("Alex", "Minaeva", 4);
        Student student5 = new Student("Lena", "D", 1);
        Student student6 = new Student("Denis", "F", 2);
        Student student7 = new Student("Sasha", "G", 3);
        Student student8 = new Student("Lesha", "F", 3);

        map.put(5.6, student1);
        map.put(6.6, student2);
        map.put(9.6, student3);
        map.put(13.6, student4);
        map.put(20.6, student5);
        map.put(26.6, student6);
        map.put(27.7, student7);
        map.put(27.7, student8);


    }
}
