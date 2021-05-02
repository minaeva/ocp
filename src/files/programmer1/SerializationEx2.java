package files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {

    public static void main(String[] args) {
        Car car = new Car("mazda", "black");
        Employee employee = new Employee("Sveta", "Minaeva", "IT",
                40, 4000.50, car);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees2.bin"))) {

            outputStream.writeObject(employee);
            System.out.println("done");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
