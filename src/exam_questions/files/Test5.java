package exam_questions.files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test5 {
        public static void main(String[] args) {
            Path path = Paths.get("/Users/sveta/Desktop/ocp/OCP/testFolder/A/B/C/Season.java");
            System.out.println(path.subpath(1,4)); //sveta/Desktop/ocp
            //// 1-2-3

            //Path path = Paths.get("F:\\A\\B\\C\\Book.java");
            //subpath(1,4) =>
            //B\C\Book.java
            //Root folder or drive is not considered in count and indexing. In the
            // given path A is at 0th index, B is at 1st index, C is at 2nd index and
            // Book.java is at 3rd index.
        }
    }
