package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {

    public static void main(String[] args) throws IOException {

        try (FileReader fileReader = new FileReader("/Users/sveta/Desktop/1.txt")) {
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("done");
        }

    }
}
