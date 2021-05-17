package exam_questions.resource_bundle;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("TestFolder/myProperties.txt");
        prop.load(fis);

        Stream<Path> files = Files.list(Paths.get(System.getProperty("user.home")));
        files.forEach(System.out::println);
    }
}
//System.getProperty("user.home") returns the HOME directory of the User (Both in
// windows and Linux).
//        What will be the result of compiling and executing Test class?


//Files.list(Path) returns the object of Stream<Path> containing all the paths (files
// and directories) of current directory. It is not recursive.
//
//For recursive access use overloaded Files.walk() methods.
