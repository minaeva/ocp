package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2(1, "Natasha", "P", 12000));
        list.add(new Employee2(100, "Ira", "I", 10000));
        list.add(new Employee2(10, "Lena", "Z", 1000));
        list.add(new Employee2(30, "Lena", "A", 13000));

        System.out.println(list);
        Collections.sort(list, (a1, a2) -> a1.salary - a2.salary);
        System.out.println("by LAMBDA SALARY");
        System.out.println(list);
    }
    }

class Employee2 {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee2(Integer id, String name, String surname, int salary) {
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
}
