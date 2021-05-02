package lambda;

import java.util.ArrayList;

interface StudentChecks {
    boolean check(Student s);
}

public class StudentInfoWithLambda {

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

        StudentInfoWithLambda info = new StudentInfoWithLambda();

        System.out.println("s -> s.averageGrade < 8");
        info.testStudents(students, s -> s.averageGrade < 8);
        System.out.println("s -> s.age > 22");
        info.testStudents(students, s -> s.age > 22);
    }

    void testStudents(ArrayList<Student> students, StudentChecks interfaceName) {
        for (Student s : students) {
            if (interfaceName.check(s)) {
                System.out.println(s);
            }
        }
    }
}

class CheckOvergrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.averageGrade > 8;
    }

}
