package exam_questions.streams.stream;

import exam_questions.lambdas.lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExample2 {

    public static void main(String[] args) {
        Student st1 = new Student("Olya", 'f', 25, 1, 9.9);
        Student st2 = new Student("Max", 'm', 24, 2, 8.8);
        Student st3 = new Student("Sveta", 'f', 23, 3, 7.7);
        Student st4 = new Student("Igor", 'm', 22, 4, 6.6);
        Student st5 = new Student("Dan", 'm', 21, 5, 11);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);


        List<Student> compared = students.stream()
                .sorted((x, y) -> x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());

//        System.out.println(compared);


        students.stream()
                .map(element -> {
                    element.setName(element.getName().toUpperCase());
                    return element;
                })
                .filter(e -> e.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .forEach(System.out::println);
    }

}
