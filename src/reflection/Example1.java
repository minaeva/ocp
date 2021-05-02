package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Array;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("reflection.Employee");
/*
        can also be done that way:
        Class employeeClass2 = Employee.class;
        Employee emp = new Employee();
        Class employeeClass3 = emp.getClass();
*/
        Field fieldId = employeeClass.getField("id");
        System.out.println("fieldId.getType() " + fieldId.getType());

        System.out.println("*************");
        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType());
        }

        System.out.println("*************");
        //to get private fields
        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println(field.getName() + " " + field.getType());
        }

        System.out.println("*************");
        Method increaseMethod = employeeClass.getMethod("increaseSalary");
        System.out.println(increaseMethod.getName() + ", ReturnType " + increaseMethod.getReturnType() + ", ParameterTypes" + Arrays.toString(increaseMethod.getParameterTypes()) + "," + " isDefault " + increaseMethod.isDefault());

        Method setSalaryMethod = employeeClass.getMethod("setSalary", double.class);
        System.out.println(setSalaryMethod.getName() + ", ReturnType " + setSalaryMethod.getReturnType() + ", ParameterTypes" + Arrays.toString(setSalaryMethod.getParameterTypes()) + "," + " isDefault " + setSalaryMethod.isDefault());

        //to get all public methods (+ parents')
        System.out.println("*************");
        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + " " + method.getReturnType() + " " + Arrays.toString(method.getParameterTypes()));
        }

        //to get ALL __public + private__ class (without parent) methods
        System.out.println("*************");
        Method[] allMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println(method.getName() + " " + method.getReturnType() + " " + Arrays.toString(method.getParameterTypes()));
        }

        //to get __all public__ class (without parent) methods
        System.out.println("*************");
        Method[] allPublicMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println(method.getName() + " " + method.getReturnType() + " "
                        + Arrays.toString(method.getParameterTypes()));
            }
        }

        System.out.println("*************");
        Constructor constructor = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor.getParameterCount() + " " + "parameters, types are " + Arrays.toString(constructor.getParameterTypes()));
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class
                , String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() + " " +
                "parameters, types are " + Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("*************");
        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor c : constructors) {
            System.out.println("Constructor " + c.getName() + " has " + c.getParameterCount() + " parameters, types are " + Arrays.toString(constructor2.getParameterTypes()));

        }
    }
}
