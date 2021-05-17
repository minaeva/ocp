package exam_questions.files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test4 {
    public static void main(String[] args) {
        Path path1 = Paths.get("testFolder/A/B/C");
        Path path2 = Paths.get("testFolder/A");
        System.out.println(path1.relativize(path2)); //../..
        System.out.println(path2.relativize(path1));//B/C

        //path1.relativize(path2) means how to reach path2 from path1. It is by doing
        // 'cd ..\..' so, 1st output is '..\..'
        //path2.relativize(path1) means how to reach path1 from path2. It is by doing
        // 'cd B\C' so, 2nd output is 'B\C'.
    }
}
