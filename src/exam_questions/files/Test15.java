package exam_questions.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test15 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:/temp.txt")) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //IOException should be caught to compile
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//    Does above code compile successfully?
//no
