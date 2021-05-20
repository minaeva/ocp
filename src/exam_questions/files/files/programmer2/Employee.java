package exam_questions.files.files.programmer2;

import exam_questions.files.files.programmer1.Car;

import java.io.Serializable;

public class Employee implements Serializable {

    String name;
    String department;
    int age;
    transient double salary;
    Car car;

    public Employee(String name, String department, int age, double salary, Car car) {
        this.name = name;
        this.age = age;
        this.department = department;
//        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
