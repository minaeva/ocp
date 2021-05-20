package exam_questions.collections.collections;

import java.util.LinkedList;

public class LinkedListEx1 {

    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Olya", 2);
        Student2 st3 = new Student2("Sveta", 3);
        Student2 st4 = new Student2("Ira", 2);
        Student2 st5 = new Student2("Dima", 1);
        Student2 st6 = new Student2("Lev", 4);

        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        student2LinkedList.add(st6);

        System.out.println(student2LinkedList);
        System.out.println(student2LinkedList.get(2));

        Student2 st7 = new Student2("Vera", 1);
        Student2 st8 = new Student2("Varya", 4);
        student2LinkedList.add(st7);
        student2LinkedList.add(1, st8);
        System.out.println(student2LinkedList);

        student2LinkedList.remove(2);
        System.out.println(student2LinkedList);

    }

}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
