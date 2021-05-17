package exam_questions.files;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("1.jpg");
             FileOutputStream fos = new FileOutputStream("2.jpg")) {
            int res;
            byte[] arr = new byte[500000]; //Line 10
            while ((res = fis.read(arr)) != -1) { //Line 11
                fos.write(arr); //Line 12
//                fos.write(arr, 0, res);//this one will do exact copy
            }

            //Will above code create exact copy of 'orig.png' file?
            //no
        }
    }
}
