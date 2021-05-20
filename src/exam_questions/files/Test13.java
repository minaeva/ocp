package exam_questions.files;

import java.io.*;

public class Test13 {
        public static void main(String[] args) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\temp.tmp"));
            try(BufferedWriter writer = bw) { //Line 8

            } finally {
                bw.flush(); //Line 11
                //Exception in thread "main" java.io.IOException: Stream closed
            }
        }
    }
