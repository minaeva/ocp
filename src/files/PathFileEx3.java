package files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathFileEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text1.txt");
        //        Files.createFile(filePath);
        //        String dialog = "-hi\n-hello\n-how are you\n-fine thanks!";
        //        Files.write(filePath, dialog.getBytes());

        List<String> list = Files.readAllLines(filePath);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
