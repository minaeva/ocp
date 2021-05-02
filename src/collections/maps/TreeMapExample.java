package collections.maps;

import java.util.TreeMap;

public class TreeMapExample {

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
        map.put(3.6, student4);
        map.put(0.6, student5);
        map.put(26.6, student6);
        map.put(7.7, student7);
        map.put(7.7, student8);

        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.get(7.7));
        map.remove(0.0);
        System.out.println(map.size());

        map.remove(6.7);
        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.descendingMap());

        System.out.println(map.tailMap(7.7));
        System.out.println(map.headMap(5.6));
        System.out.println(map.lastEntry());
        System.out.println(map.firstEntry());

    }
}
