package reflection;

public class Employee2 {
    public int id;
    public String name;
    public String department;
    private double salary = 1000;

    public Employee2() {
    }

    public Employee2(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void increaseSalary() {
        salary *= 2;
    }

    private void changeDepartment(String newDepartment) {
        this.department = newDepartment;
        System.out.println("New department " + department);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' + ", salary=" + salary + '}';
    }
}
