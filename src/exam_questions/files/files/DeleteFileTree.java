package exam_questions.files.files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteFileTree {
    public static void main(String[] args) throws IOException {
        Path toDelete = Paths.get("/Users/sveta/Desktop/copyHere");
        Files.walkFileTree(toDelete, new MyFileVisitor3());
        System.out.println("done");
    }
}
class MyFileVisitor3 extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("delete file " + file);
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("delete " + dir);
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }

}


