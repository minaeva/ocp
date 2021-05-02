package lambda;

import java.util.ArrayList;

public class StudentInfo {

    public static void main(String[] args) {
        Student st1 = new Student("Olya", 'f',25, 1,9.9);
        Student st2 = new Student("Max", 'm',24, 2,8.8);
        Student st3 = new Student("Sveta", 'f',23, 3,7.7);
        Student st4 = new Student("Igor", 'm',22, 4,6.6);
        Student st5 = new Student("Dan", 'm',21, 5,11);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        info.printStudentsOverGrade(students, 8);
        info.printStudentsUnderAge(students, 22);
        info.printStudentsMix(students, 22, 9.0, 'm');

    }

    void printStudentsOverGrade(ArrayList<Student> students, double grade) {
        System.out.println("printStudentsOverGrade " + grade);
        for (Student s: students) {
            if (s.averageGrade > grade) {
                System.out.println(s);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> students, int age) {
        System.out.println("printStudentsUnderAge " + age);
        for (Student s: students) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }
    void printStudentsMix(ArrayList<Student> students, int age, double grade, char sex) {
        System.out.println("printStudentsMix: >" + age + ", <" + grade + ", =" + sex);

        for (Student s: students) {
            if (s.age > age && s.averageGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }
}
