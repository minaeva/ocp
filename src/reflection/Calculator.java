package reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {

    void sum(int a, int b) {
        int result = a + b;
        System.out.println("sum " + a + " + " + b + " = " + result);
    }

    void subtract(int a, int b) {
        int result = a - b;
        System.out.println("subtract " + a + " - " + b + " = " + result);
    }

    void multiply(int a, int b) {
        int result = a * b;
        System.out.println("multiply " + a + " * " + b + " = " + result);
    }

    void divide(int a, int b) {
        int result = a / b;
        System.out.println("divide " + a + " / " + b + " = " + result);
    }
}

class TestCalculator {
    public static void main(String[] args) throws InvocationTargetException,
            IllegalAccessException {
        try (BufferedReader reader = new BufferedReader(new FileReader("calc.txt"))) {
            String methodFromFile = reader.readLine();
            String firstArg = reader.readLine();
            String secondArg = reader.readLine();

            Calculator calculator = new Calculator();
            Class c1 = calculator.getClass();

            Method method = null;

            Method[] declaredMethods = c1.getDeclaredMethods();
            for (Method m : declaredMethods) {
                if (m.getName().equals(methodFromFile)) {
                    method = m;
                }
            }
            method.invoke(calculator, Integer.parseInt(firstArg),
                    Integer.parseInt(secondArg));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
