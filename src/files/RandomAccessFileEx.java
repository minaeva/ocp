package files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {

    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")) {

            int a = file.read();
            System.out.println((char) a);
            String s = file.readLine();
            System.out.println(s);

            file.seek(101);
            s = file.readLine();
            System.out.println(s);

            long pos = file.getFilePointer();
            System.out.println(pos);

//            file.seek(0);
//            file.writeBytes("ttt");

            file.seek(file.length()-1);
            file.writeBytes("\n\n\t\t\tWitman");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
