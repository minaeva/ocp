package exam_questions.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test11 {
    public static void main(String[] args) throws IOException {
        /*INSERT*/

//        Files.readAllLines(Paths.get("testFolder/Season.java")).stream().forEach(System.out::println);

        Files.readAllLines(Paths.get("testFolder/Season.java")).forEach(System.out::println);
        Files.lines(Paths.get("testFolder/Season.java")).forEach(System.out::println);
//        Files.lines(Paths.get("testFolder/Season.java")).stream().forEach(System
        //        .out::println); //NO
    }
}
