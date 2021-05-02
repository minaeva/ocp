package collections.maps;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample2 {

    public static void main(String[] args) {
        TreeMap<Student, Double> map = new TreeMap<>();
        Student student1 = new Student("Sveta", "Minaeva", 1);
        Student student2 = new Student("Sveta", "Bezsmertna", 2);
        Student student3 = new Student("Olye", "Minaeva", 3);
        Student student4 = new Student("Alex", "Minaeva", 4);
        Student student5 = new Student("Lena", "D", 1);
        Student student6 = new Student("Denis", "F", 2);
        Student student7 = new Student("Sasha", "G", 3);
        Student student8 = new Student("Lesha", "F", 3);

        map.put(student1, 4.1);
        map.put(student2, 4.2);
        map.put(student3, 4.3);
        map.put(student4, 4.4);
        map.put(student5, 4.5);
        map.put(student6, 4.6);
        map.put(student7, 4.7);

        System.out.println(map);

        TreeMap<Person, Integer> treeMap = new TreeMap<>(Comparator.comparingInt(Person::getAge));
        Person person1 = new Person("igor", 22);
        Person person2 = new Person("sasha", 12);
        Person person3 = new Person("zaur", 2);
        Person person4 = new Person("zaur", 2);
        Person person5 = new Person("zaur3", 2);

        treeMap.put(person1, 1);
        treeMap.put(person2, 2);
        treeMap.put(person3, 3);
//        treeMap.put(person4, 3);

        System.out.println(treeMap);
        System.out.println(treeMap.containsKey(person4)); //
        System.out.println(treeMap.containsKey(person5)); //
    }


    }

    class Person {
    private String name;
    private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
