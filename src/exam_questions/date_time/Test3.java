package exam_questions.date_time;

import java.io.*;
import java.time.LocalDate;
import java.util.Optional;

public class Test3 {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            Optional<LocalDate> optional = Optional.of(LocalDate.of(2018, 12, 1));
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(("date.ser")));
                 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("date.ser")))
            {
                oos.writeObject(optional);

                Optional<?> object = (Optional<?>)ois.readObject();
                System.out.println(object.get());
            }
        }

        //Optional class doesn't implement Serializable interface,
    // hence 'oos.writeObject(optional);' throws exception at runtime.
    }
