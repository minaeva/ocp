package exam_questions.lambdas.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample {

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

        PredicateExample example = new PredicateExample();
        System.out.println("s.course > 3");
        Predicate<Student> pCourse = s -> s.course > 3;
        example.testStudents(students, pCourse);

        System.out.println("s.course <= 3");
        example.testStudents(students, pCourse.negate());

        System.out.println("s.age > 22 && s.sex = f");
        Predicate<Student> pAge = s -> s.age > 22;
        Predicate<Student> pSex = s -> s.sex > 'f';
        example.testStudents(students, pAge.and(pSex));

        System.out.println("s.age > 22 || s.sex = f");
        example.testStudents(students, pAge.or(pSex));

    }

    void testStudents(ArrayList<Student> students, Predicate<Student> predicate) {
        for (Student s : students) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}
