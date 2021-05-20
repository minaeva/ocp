package exam_questions.files.files;

import java.io.*;

public class BufferedInputEx {

    public static void main(String[] args) {

        try (BufferedInputStream reader = new BufferedInputStream(
                new FileInputStream("/Users/sveta/Desktop/sveta.jpg"));
             BufferedOutputStream writer = new BufferedOutputStream(
                     new FileOutputStream("output.jpg")
             )) {
            int character;
            while ((character = reader.read()) != -1)
                writer.write(character);

            System.out.println("done");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
