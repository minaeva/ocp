package exam_questions.files;

import java.io.File;
import java.io.IOException;


/*F:.
        └───Test
        │   t1.pdf
        │   t2.pdf
        │
        ├───A
        │   │   a.pdf
        │   │
        │   ├───B
        │   │   │   b.pdf
        │   │   │
        │   │   └───M
        │   │           m.pdf
        │   │
        │   ├───C
        │   │       c.pdf
        │   │
        │   └───D
        │           d.pdf
        │
        └───X
        └───Y
        │   y.pdf
        │
        └───Z
        z.pdf

        What will be the result of compiling and executing Test class?

*/

public class Test3 {
    public static void main(String[]  args) throws IOException {
        deleteFiles(new File("testFiles/Test"), ".txt");
    }

    public static void deleteFiles(File dir, String extension) throws IOException {
        File[] list = dir.listFiles();
        //NOTE: listFiles() method returns File[] and list() method returns String [].
        if (list != null && list.length > 0) {
            for (File file : list) {
                if (file.isDirectory()) {
                    deleteFiles(file, extension);
                } else if (file.getName().endsWith(extension)) {
                    file.delete();
                }
            }
        }
        //all .pdf files will be deleted
    }
}
