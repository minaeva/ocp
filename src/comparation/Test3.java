package comparation;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<>();
        list.add(new Employee1(1, "Natasha", "P", 12000));
        list.add(new Employee1(100, "Ira", "I", 10000));
        list.add(new Employee1(10, "Lena", "Z", 1000));
        list.add(new Employee1(30, "Lena", "A", 13000));

        System.out.println(list);
        Collections.sort(list, new NameComparator().reversed());
        System.out.println("by NAME REVERSE");
        System.out.println(list);

        Collections.sort(list, new SalaryComparator());
        System.out.println("by SALARY");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("by DEFAULT");
        System.out.println(list);

        Collections.sort(list, (e1, e2)->e1.surname.compareTo(e2.surname));
        System.out.println("by SURNAME");
        System.out.println(list);

    }
}

class Employee1 implements Comparable<Employee1> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee1(Integer id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee1 employee) {
        return this.id - employee.id;
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

class IdComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 emp1, Employee1 emp2) {
        return emp1.id.compareTo(emp2.id);
    }
}

class NameComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 emp1, Employee1 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 emp1, Employee1 emp2) {
        return emp1.salary - emp2.salary;
    }
}

//class ReverseIdComparator implements Comparator<Employee1> {
//
//    @Override
//    public int compare(Employee1 o1, Employee1 o2) {
//        return Comparator.naturalOrder(o1);
//    }
//
//}
