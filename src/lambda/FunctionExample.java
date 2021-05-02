package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Student st1 = new Student("Olya", 'f', 25, 1, 9.9);
        Student st2 = new Student("Max", 'm', 24, 2, 8.8);
        Student st3 = new Student("Sveta", 'f', 23, 3, 7.7);
        Student st4 = new Student("Igor", 'm', 22, 4, 6.6);
        Student st5 = new Student("Dan", 'm', 21, 5, 11);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Function<Student, Double> function = student -> student.averageGrade;
        double res = average(students, student -> student.averageGrade);
        System.out.println(res);

        double courseAverage = average(students, student -> Double.valueOf(student.course));
        System.out.println(courseAverage);
    }

    private static double average(List<Student> students, Function<Student, Double> function) {
        double result = 0;
        for (Student s : students) {
            result += function.apply(s);
        }
        result = result/ students.size();
        return result;
    }
}
