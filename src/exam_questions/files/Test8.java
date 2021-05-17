package exam_questions.files;

// X:.
//  └───Y
//    └───Z

import java.io.*;

public class Test8 {
        public static void main(String[] args) {
            File dir = new File("X" + File.separator + "Y" + File.separator + "Z");
            System.out.println(dir.getParentFile().getParent()); //X
            System.out.println(dir.getParent()); //X/Y
        }
    }
//X
