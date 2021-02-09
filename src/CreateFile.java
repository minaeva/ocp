import java.io.*;
import java.sql.SQLOutput;

public class CreateFile {

    public static void main(String[] args) throws Exception {

        File file = new File("/Users/sveta/Desktop/diff.txt");
        File desktopDir = new File("/Users/sveta/Desktop/");

//        printFileInfo(file);

//        readThreeLines(file);

//        ls(new File("/Users/sveta/Desktop/hebrew"));

//        copy(file, new File(desktopDir, "newOne.txt"));
        copyBuffered(file, new File(desktopDir, "newTwo.txt"));

    }


    public static void copy(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {

            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            System.out.println("done");
        }
    }

    public static void readThreeLines(File file) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
        }

    }

    public static void printFileInfo(File file) {
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.lastModified());

    }

    public static void ls(File file) {
        for (File one : file.listFiles()) {
            System.out.println(one.getAbsolutePath());
        }

    }

    public static void copyBuffered(File source, File destination) throws IOException {
        try (InputStream in = new BufferedInputStream(new FileInputStream(source));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        }
    }
}


