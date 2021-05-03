package regex;

public class PrintfExample {

    static void employeeInfo(Employee employee) {
        System.out.printf("ID: %03d \t NAME: %-12s \t %-15s \t %,.1f \n", employee.id, employee.name, employee.surname,
                employee.salary*(1+ employee.bonusPer));
    }
    public static void main(String[] args) {
//        System.out.printf("string - 1st left align, 2nd round ", "output", 3.14159);
        Employee employee1 = new Employee(12, "Sveta", "Minaeva", 800, 0.75);
        Employee employee2 = new Employee(2, "Second", "Ivanov", 1800, 0.5);
        Employee employee3 = new Employee(123, "Third", "Biden", 3800, 0.25);
        employeeInfo(employee1);
        employeeInfo(employee2);
        employeeInfo(employee3);

        String newS = String.format("ID: %03d \t NAME: %-12s \t %-15s \t %,.1f \n", 5, "Zaur", "Tregulov", 14999.678);
        System.out.println(newS);
    }

}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPer;

    public Employee(int id, String name, String surname, int salary, double bonusPer) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPer = bonusPer;
    }
}
