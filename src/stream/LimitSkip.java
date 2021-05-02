package stream;

import lambda.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkip {

    public static void main(String[] args) {
        Student st1 = new Student("Olya", 'f', 23, 1, 9.9);
        Student st2 = new Student("Max", 'm', 25, 2, 8.8);
        Student st3 = new Student("Sveta", 'f', 24, 3, 7.7);
        Student st4 = new Student("Igor", 'm', 22, 4, 6.6);
        Student st5 = new Student("Dan", 'm', 21, 5, 11);
        Student st6 = new Student("Dan26", 'm', 26, 5, 12);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        List<Student> all = students.stream()
                .filter(s -> s.getAge() > 22)
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
        System.out.println(all);
        System.out.println("************");
        List<Student> found = students.stream()
                .filter(s -> s.getAge() > 22)
                .sorted(Comparator.comparing(Student::getName))
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());
        System.out.println(found);

    }
}
