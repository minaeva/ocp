package exam_questions.files.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathFileEx1 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("pathFile.txt");
        Path directoryPath = Paths.get("/Users/sveta/Desktop/directory");

        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());

        System.out.println("----------------");
        System.out.println("filePath.getParent() " + filePath.getParent());
        System.out.println("directoryPath.getParent() " + directoryPath.getParent());

        System.out.println("----------------");
        System.out.println("filePath.isAbsolute() " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute() " + directoryPath.isAbsolute());

        System.out.println("----------------");
        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.toAbsolutePath());

        System.out.println("----------------");
        System.out.println("filePath.toAbsolutePath().getParent() " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.toAbsolutePath().getRoot() " + directoryPath.toAbsolutePath().getRoot());

        System.out.println("----------------");
        System.out.println("directoryPath.resolve(filePath) " + directoryPath.resolve(filePath));

        Path anotherPath = Paths.get("/Users/sveta/Desktop/directory/inside/1.txt");
        System.out.println("----------------");
        System.out.println("directoryPath.relativize(anotherPath) " + directoryPath.relativize(anotherPath));

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }

        System.out.println("----------------");
        System.out.println("Files.isReadable(filePath) " + Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath) " + Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath) " + Files.isExecutable(filePath));

        System.out.println("----------------");
        Path filePath2 = Paths.get("/Users/sveta/Desktop/ocp/OCP/pathFile.txt");
        System.out.println("Files.isSameFile(filePath, filePath2) " + Files.isSameFile(filePath, filePath2));

        System.out.println("----------------");
        Path file = Paths.get("text10.txt");
        System.out.println("Files.size(file) " + Files.size(file));
        System.out.println("Files.getAttribute(file,\"creationTime\") " + Files.getAttribute(file, "creationTime"));
        System.out.println("Files.getAttribute(file,\"size\") " + Files.getAttribute(file, "size"));

        System.out.println("----------------");
        Map<String, Object> attributes = Files.readAttributes(file, "*");
        for (Map.Entry<String, Object> entry: attributes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
