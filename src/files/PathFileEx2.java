package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;/**/
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathFileEx2 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text10.txt");
        Path directory1 = Paths.get("/Users/sveta/Desktop/1");
        Path directoryPath = Paths.get("/Users/sveta/Desktop/directory");
        Path directoryPath2 = Paths.get("/Users/sveta/Desktop/ocp");

//        Files.copy(filePath, directoryPath.resolve(filePath));
//        Files.copy(filePath, directoryPath.resolve("filePath.txt"));

//                Files.copy(filePath, directoryPath.resolve(filePath),
//          StandardCopyOption.REPLACE_EXISTING);
//                Files.copy(directoryPath,
//                        directoryPath2.resolve(directoryPath.getFileName()));

        //                Files.move(directory1,
//                        directoryPath.resolve(directory1.getFileName()));

//rename
//        Path file = Paths.get("/Users/sveta/Desktop/1/filePath.txt");
//                Files.move(file,file.getParent().resolve("2.txt"));

//        Files.delete(Path.of("pathFile.txt"));

        //        Files.delete(directoryPath);
    }
}
