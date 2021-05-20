package exam_questions.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

public class Test12 {
        public static void main(String[] args) throws IOException{
            Path path = Paths.get("testFolder/A/B");
            System.out.println(Files.isDirectory(path));
//            System.out.println(File.isDirectory(path));
            System.out.println(path.toFile().isDirectory());
            System.out.println(Files.getAttribute(path, "isDirectory"));
//            System.out.println(new File(path).isDirectory());
            /*INSERT*/
        }
    }
//    Which of the following statements,
//    if used to replace /*INSERT*/,
//    will successfully print 'true' on to the console?
//    Select 3 options.
