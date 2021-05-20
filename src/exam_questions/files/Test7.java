package exam_questions.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class Test7 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("testFolder/F");
        BiPredicate<Path, BasicFileAttributes> predicate =
                (p, a) -> p.toString().endsWith("txt");
        try (Stream<Path> paths = Files.find(root, 2, predicate)) {
            paths.forEach(System.out::println);
            //testFolder/F/Parent/c.txt
            //testFolder/F/Parent/d.txt
        }

        //following syntax is used: Files.find(root, 2, predicate).
        //
        //root refers to 'F:' and maxDepth is 2. This means look out for all the exam_questions.files.files
        // under F: (depth 1) and all the exam_questions.files.files under the directories whose immediate
        // parent is F: (depth 2).
        //
        //
        //
        //So in this case, F: and Parent directory are searched for the matching exam_questions.files.files.
        // 'F:Parent\a.txt' and 'F:Parent\b.txt' are printed on to the console.
    }
}







/*
F: is accessible for reading/writing and below is the directory structure for F:

        F:.
        └───Parent
        │   a.txt
        │   b.txt
        │
        └───Child
        c.txt
        d.txt*/
