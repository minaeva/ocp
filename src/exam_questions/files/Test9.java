package exam_questions.files;

//    C:\ is accessible for reading/writing and below is the content of 'C:\TEMP' folder:
//    C:\TEMP
//│   msg
//│└───Parent
//    └───Child
//    Message.txt
//'msg' is a symbolic link file for 'C:\TEMP\Parent\Child\Message.txt'.
//
//    Message.txt contains following text:
//    Welcome!

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test9 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("testFolder/X", "TEMP", "msg");

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String str = null;
            while ((str = reader.readLine()) != null) { //NO - MalformedInputException
                System.out.println(str);
            }
        }
        //To create symbolic link used in this question, I used below command:
        //C:\TEMP>mklink msg .\Parent\Child\Message.txt
        //
        //And below message was displayed on to the console for the successful creation
        // of symbolic link 'symbolic link created for msg <<===>>
        // .\Parent\Child\Message.txt'.
        //
        //Files class has methods such as newInputStream(...), newOutputStream(...),
        // newBufferedReader(...) and newBufferedWriter(...) for files reading and
        // writing.
        //
        //Give code doesn't cause any compilation error.
        //
        //path refers to 'C\TEMP\msg', which is a symbolic link and hence Files
        // .newBufferedReader(path) works with 'C:\TEMP\Parent\Child\Message.txt'.
        //
        //Given code successfully reads the file and prints 'Welcome!' on to the console.
    }
}
