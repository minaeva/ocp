package exam_questions.diff.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

}

@MyAnnotation
public class Employee {
//    @MyAnnotation
    String name;
    double salary;

//    @MyAnnotation
    public Employee(String name,
//                    @MyAnnotation double salary) {
                     double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Deprecated
    public void increaseSalary() {
        salary += 2;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + '}';
    }
}

