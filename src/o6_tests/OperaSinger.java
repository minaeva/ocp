package o6_tests;

public class OperaSinger {
    public static void main(String[] args) {
        check((h, l) -> h>5, 5);  // m1
    }
    private static void check(Sing sing, int volume) {
        if (sing.isTooLoud(volume, 10))   // m2
            System.out.println("not so great");
        else System.out.println("great");
    } }
