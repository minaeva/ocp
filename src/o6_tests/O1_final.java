package o6_tests;

import java.util.function.Predicate;

public class O1_final {
    final static String y = "0";
    final String i = "0";
//    var v1 = "0";
//    final var v2 = "0";

    O1_final() {
        Predicate<Integer> p1 = (final var a) -> {
            int bb = 0;
            int c = 0;
            return bb == c;
        };
    }
}
