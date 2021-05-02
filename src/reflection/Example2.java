package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example2 {
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, NoSuchMethodException,
            InvocationTargetException {
        Class employeeClass = Class.forName("reflection.Employee");

        //deprecated
        //        Employee o = (Employee) employeeClass.newInstance();
        //        System.out.println(o);

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee o1 = constructor1.newInstance();
        System.out.println(o1);

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class
                , String.class);
        Object o2 = constructor2.newInstance(5, "Zaur", "HR");
        System.out.println(o2);

        Method method  = employeeClass.getMethod("setSalary", double.class);
        method.invoke(o2, 3.3);
        System.out.println(o2);
    }
}
