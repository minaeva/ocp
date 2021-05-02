package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Hi my friend\nhow are you\ni'm fine");
//        String s1 = scanner.next();
//        String s2 = scanner.nextLine();
//        String s3 = scanner.next();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

       /* while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            System.out.println(s);
        }*/
        /*while (scanner.hasNext()){
            String s = scanner.next();
            System.out.println(s);
        }*/

        System.out.println(scanner.next().charAt(0));
        scanner.close();
    }
}
