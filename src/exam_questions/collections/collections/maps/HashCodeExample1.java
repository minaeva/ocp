package exam_questions.collections.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("Sveta", "Minaeva", 1);
        Student student2 = new Student("Sveta", "Bezsmertna", 2);
        Student student3 = new Student("Olye", "Minaeva", 3);
        Student student4 = new Student("Alex", "Minaeva", 4);

        map.put(student1, 5.5);
        map.put(student2, 7.5);
        map.put(student3, 9.5);
        map.put(student4, 10.5);

        System.out.println(map);

//        Student student5 = new Student("Sveta", "Minaeva", 1);
//        System.out.println(map.containsKey(student5));
//        Student student6 = new Student("0", "0", 0);
//        System.out.println(map.containsKey(student6));


        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
    }

}


class Student implements Comparable<Student> {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname,
                student.surname);
    }

//    @Override
//    public int hashCode() {
//        return name.length()*7 + surname.length()*11 + course*53;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.surname.compareTo(o.surname);
    }
}
