package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch2 {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "first", 100);
        Employee employee2 = new Employee(20, "second", 200);
        Employee employee3 = new Employee(13, "third", 300);
        Employee employee4 = new Employee(44, "fourth", 400);
        Employee employee5 = new Employee(5, "fifth", 500);
        Employee employee6 = new Employee(20, "sixth", 600);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        System.out.println(employees);

        Collections.sort(employees);
        System.out.println(employees);

        int index = Collections.binarySearch(employees, employee2);
        System.out.println(index);

    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee another) {
        int result = this.id - another.id;
        if (result == 0) {
            result = this.name.compareTo(another.name);
        }

        return result;
    }
}
