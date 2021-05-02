package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scanner3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = null;
        Set<String> set = new TreeSet<>();
        try {
            scanner = new Scanner(new FileReader(new File("/Users/sveta/Desktop/2.txt")));
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()) {
                String word = scanner.next();
                set.add(word);
            }
            for (String w : set) {
                System.out.println(w);
            }
        } catch (FileNotFoundException e) {
            System.out.println("problem");
        } finally {
            scanner.close();
        }
    }
}
