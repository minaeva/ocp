package reflection;

import java.lang.reflect.Field;

public class Example3 {
    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchFieldException, IllegalAccessException {
        Employee2 employee2 = new Employee2(2, "Sveta", "IT");
        Class employeeClass = employee2.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (double) field.get(employee2);
        System.out.println(salaryValue);

        field.set(employee2, 555);
        System.out.println(employee2);
    }
}
