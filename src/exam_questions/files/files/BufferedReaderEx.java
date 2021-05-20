package exam_questions.files.files;

import java.io.*;

public class BufferedReaderEx {

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(
                new FileReader("/Users/sveta/Desktop/1.txt"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("/Users/sveta/Desktop/2.txt"))) {
//            int character;
//            while (((character = reader.read() != -1))) {
//                writer.write(character);
//            }
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + '\n');
            }

            System.out.println("done");
        }
}
}
