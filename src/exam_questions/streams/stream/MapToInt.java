package exam_questions.streams.stream;

import exam_questions.lambdas.lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapToInt {

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

        List<Integer> ages = students.stream()
                .mapToInt(s -> s.getAge())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(ages);

        List<Double> averages = students.stream()
                .mapToDouble(s -> s.getAverageGrade())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(averages);

        int sum = students.stream()
                .mapToInt(el -> el.getAge())
                .sum();
        System.out.println(sum);

        double avg = students.stream()
                .mapToDouble(e -> e.getAverageGrade())
                .average()
                .getAsDouble();

        System.out.println(avg);

        int min = students.stream()
                .mapToInt(el -> el.getAge())
                .min().getAsInt();
        System.out.println(min);

    }
}
