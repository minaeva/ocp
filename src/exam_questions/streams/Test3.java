package exam_questions.streams;

import java.util.stream.IntStream;

public class Test3 {
        public static void main(String[] args) {
            IntStream stream = "OCP".chars();
            stream.forEach(c -> System.out.print((char)c));
//            System.out.println(stream.count()); //Line 9 //<- runtime exc
        }

        //In this example, count() is used after using forEach() method
    // and hence IllegalStateException is thrown.
    }
