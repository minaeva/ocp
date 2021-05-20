package exam_questions.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test11 {
    public static void main(String[] args) throws IOException {
        //returns list
        Files.readAllLines(Paths.get("testFolder/Season.java"))
                .forEach(System.out::println);

        //returns exam_questions.streams.stream
        Files.lines(Paths.get("testFolder/Season.java"))
                .forEach(System.out::println);

//     Files.lines(Paths.get("testFolder/Season.java")).exam_questions.streams.stream().forEach(System.out::println); //NO
     Files.readAllLines(Paths.get("testFolder/Season.java")).stream().forEach(System.out::println);

        //public static Stream<String> lines(Path path) throws IOException {...}
        //public static List<String> readAllLines(Path path) throws IOException {...}
        //
        //'Files.lines(Paths.get("F:\\Book.java"))' returns Stream<String> object.
        // Hence forEach() can be invoked but exam_questions.streams.stream() can't be invoked.
        //
        //'Files.readAllLines(Paths.get("F:\\Book.java"))' returns List<String> object.
        // Hence both forEach() and exam_questions.streams.stream() methods can be invoked. List has both the
        // methods. But converting list to exam_questions.streams.stream() and then invoking forEach() method
        // is not required but it is a legal syntax and prints the file contents.
    }
}
