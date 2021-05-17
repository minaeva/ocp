package exam_questions.files;

import java.io.*;

public class Test1 {

    public static void main(String[] args) throws IOException {
        File file = new File("temp.dat");
        try (DataOutputStream os = new DataOutputStream(new FileOutputStream(file)); DataInputStream is = new DataInputStream((new FileInputStream(file)))) {
            os.writeChars("JAVA");
            System.out.println(is.readChar());//J
        }
    }
}
