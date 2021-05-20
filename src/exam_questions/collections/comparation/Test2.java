package exam_questions.collections.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Natasha", "Pushkina", 12000));
        list.add(new Employee(100, "Ira", "Ivanova", 10000));
        list.add(new Employee(10, "Lena", "Zorova", 1000));
        list.add(new Employee(30, "Lena", "Abasova", 13000));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

//        Employee[] arrray = new Employee[8];
//        list.toArray(arrray);
//
//        System.out.println(arrray);
//        Arrays.sort(arrray);
//        System.out.println(list);

    }
}


class Employee implements Comparable<Employee> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(Integer id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
//        return this.id - employee.id;

//        return this.id.compareTo(employee.id);

//        return this.name.compareTo(employee.name);

        int res = this.name.compareTo(employee.name);
        if (res == 0) {
            return this.surname.compareTo(employee.surname);
        }
        return res;

    }
}
