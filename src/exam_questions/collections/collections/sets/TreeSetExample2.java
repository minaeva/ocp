package exam_questions.collections.collections.sets;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample2 {

    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student student1 = new Student("z", 11);
        Student student2 = new Student("b", 1);
        Student student3 = new Student("y", 12);
        Student student4 = new Student("d", 2);
        Student student5 = new Student("m", 13);
        Student student6 = new Student("x", 3);

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);
        treeSet.add(student6);

        System.out.println(treeSet);

        System.out.println("first " + treeSet.first());
        System.out.println("last " + treeSet.last());


        Student student7 = new Student("seventh", 6);
        Student student8 = new Student("zorro", 6);
        Student student9 = new Student("zorro", 1);

        System.out.println("headSet till *seventh " + treeSet.headSet(student7));
        System.out.println("tailSet after *seventh " + treeSet.tailSet(student7));
        System.out.println("subSet " + treeSet.subSet(student7, student8));

        System.out.println(student9.equals(student8));
        System.out.println(student9.hashCode() == student8.hashCode());

    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return
//                course == student.course &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name
//                , course
        );
    }
}
