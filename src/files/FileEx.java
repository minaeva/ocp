package files;

import java.io.File;

public class FileEx {

    public static void main(String[] args) {
        File file = new File("test2.txt");
        File folder = new File("/Users/sveta/Desktop");
        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());
        System.out.println(file.isDirectory());
        System.out.println(folder.isDirectory());
    }
}
