package exam_questions.collections.collections;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {

    public static void main(String[] args) {
        Student student1 = new Student("A", 'm', 21, 9.1);
        Student student2 = new Student("B", 'm', 22, 9.2);
        Student student3 = new Student("C", 'm', 23, 9.3);
        Student student4 = new Student("D", 'm', 24, 9.4);
        Student student5 = new Student("E", 'm', 25, 9.5);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        System.out.println(students);

        Student student6 = new Student("E", 'm', 25, 9.5);
        students.remove(student6);
        System.out.println(students);

    }

}

class Student {

    private String name;
    private char sex;
    private int age;
    private double average;

    public Student(String name, char sex, int age, double average) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", sex=" + sex +
                ", age=" + age +
                ", average=" + average +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && Double.compare(student.average, average) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, average);
    }
}
