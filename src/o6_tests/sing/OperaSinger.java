package o6_tests.sing;

import o6_tests.sing.Sing;

public class OperaSinger {
    public static void main(String[] args) {
        Sing s = (h, l) -> h > l;
        check(s, 15, 20);  // m1
    }

/*
    interface Sing {
        boolean isTooLoud(int volume, int limit);
    }
*/

    private static void check(Sing sing, int volume, int limit) {
        if (sing.isTooLoud(volume, limit))   // m2
            System.out.println("too loud");
        else System.out.println("it's  ok");
    }
}
