package o6_tests;

import java.util.function.Predicate;

public class Lambdas {

//    Predicate<String> p1 = (String w, var c) -> 39;
/*    Predicate<String> p2 = (final String c) -> {
    };
    Predicate<String> p3 = (a, b, c) -> {
        int b = 3;
        return 2;
    };
    Predicate<String> p4 = (x, y) -> new RuntimeException();
    Predicate<String> p5 = (var y) -> return 0;

 */
    Predicate<String> p51 = (var y) -> Integer.valueOf(y) > 9;
 /*   Predicate<String> p6 = () -> {
        float r;
    };

    Predicate<String> p7 = (String a, b) -> {
        return true;
    };*/
}
