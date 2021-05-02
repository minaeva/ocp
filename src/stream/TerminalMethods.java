package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalMethods {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 6, 4, 9, 3, 5, 8);

//        stream.filter(e -> {
//            System.out.println("!!!");
//            return e % 2 == 0;
//        }); //no !!!
        stream.filter(e -> {
            System.out.println("!!!");
            return e % 2 == 0;
        }).collect(Collectors.toList()); //!!! 8 times
    }
}
