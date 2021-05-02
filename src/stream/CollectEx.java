package stream;

import lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx {

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

        Map<Integer, List<Student>> studentsByAge = students.stream()
                .map(element -> {
                    element.setName(element.getName().toUpperCase());
                    return element;
                })
                .collect(Collectors.groupingBy(e -> e.getAge()));

        for (Map.Entry<Integer, List<Student>> entry : studentsByAge.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<Boolean, List<Student>> studentsOlder22 = students.stream()
                .map(element -> {
                    element.setName(element.getName().toUpperCase());
                    return element;
                })
                .collect(Collectors.partitioningBy(e -> e.getAge() > 22));

        for (Map.Entry<Boolean, List<Student>> entry : studentsOlder22.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
