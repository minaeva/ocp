package stream;

import lambda.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindFirstMinMax {
    public static void main(String[] args) {
        Student st1 = new Student("Olya", 'f', 23, 1, 9.9);
        Student st2 = new Student("Max", 'm', 21, 2, 8.8);
        Student st3 = new Student("Sveta", 'f', 23, 3, 7.7);
        Student st4 = new Student("Igor", 'm', 22, 4, 6.6);
        Student st5 = new Student("Dan", 'm', 21, 5, 11);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Student student = students.stream()
                .filter(st -> st.getAge() > 21)
                .sorted((s1, s2) -> s1.getName().compareTo(st2.getName()))
                .findFirst().get();

        System.out.println(student);

        Student stMin = students.stream()
                .filter(st -> st.getAge() > 21)
                .min(Comparator.comparing(Student::getName)).get();
        System.out.println(stMin);

        Student stMax = students.stream()
                .filter(st -> st.getAge() > 21)
                .max(Comparator.comparing(Student::getName)).get();

        System.out.println(stMax);

    }
}
