package exam_questions.diff;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        System.out.print("Enter some text: ");
        try (Scanner scan = new Scanner(System.in)) {
            String s = scan.nextLine();
            System.out.println(s);
            scan.close();
            scan.close();
        }
    }

    //Even though Scanner is created in try-with-resources block, calling close()
    // method explicitly doesn't cause any problem.
    //
    //Scanner class allows to invoke close() method multiple times. In this case, it
    // will be called 3 times: twice because of scan.close() and once because of
    // try-with-resources statement.
//    'HELLO' is printed on to the console and program terminates successfully.
}
