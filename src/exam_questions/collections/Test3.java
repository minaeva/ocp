package exam_questions.collections;

import java.util.*;

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static int compareByName(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }

    public int hashCode() {
        return name.hashCode() + age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student stud = (Student) obj;
            return this.name.equals(stud.name) && this.age == stud.age;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(Student::compareByName);
        students.add(new Student("James", 20));
        students.add(new Student("James", 20));
        students.add(new Student("James", 22));

        System.out.println(students.size()); //1
    }
    //TreeSet requires you to provide either Comparable or Comparator.

    // NOTE: To be used with TreeSet, it is not needed to override equals(Object) and
    // hashCode() methods.
    //But in real world projects, it is a good practice to override hashCode() and
    // equals(Object) methods for the classes to be used in Collection framework.
    //
    //In this case 'new TreeSet<>(Student::compareByName);' provides the instance of
    // Comparator<Student> type, which compares the names only.
    //
    //All 3 Student objects have same name and hence only first Student object was
    // added to this set.
}

//cmd + shift + backspace
