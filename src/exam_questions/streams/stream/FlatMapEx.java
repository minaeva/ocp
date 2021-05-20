package exam_questions.streams.stream;

import exam_questions.lambdas.lambda.Student;

import java.util.ArrayList;
import java.util.List;

public class FlatMapEx {

    public static void main(String[] args) {
        Student st1 = new Student("Olya", 'f', 25, 1, 9.9);
        Student st2 = new Student("Max", 'm', 24, 2, 8.8);
        Student st3 = new Student("Sveta", 'f', 23, 3, 7.7);
        Student st4 = new Student("Igor", 'm', 22, 4, 6.6);
        Student st5 = new Student("Dan", 'm', 21, 5, 11);

        Faculty f1 = new Faculty("Ecomonics");
        Faculty f2 = new Faculty("Applied Math");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);

        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);


        facultyList.stream()
                .flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(student -> System.out.println(student.getName()));
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty (Student student) {
        studentsOnFaculty.add(student);
    }
}
