package exam_questions.collections.collections.queue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {

        PriorityQueue<Student> queue = new PriorityQueue<>();
        Student student1 = new Student("Sveta", "A", 1);
        Student student2 = new Student("Sveta", "B", 2);
        Student student3 = new Student("Olya", "D", 3);
        Student student4 = new Student("Alex", "C", 4);

        queue.add(student1);
        queue.add(student2);
        queue.add(student3);
        queue.add(student4);

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}

class Student implements Comparable<Student> {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname,
                student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.surname.compareTo(o.surname);
    }
}
