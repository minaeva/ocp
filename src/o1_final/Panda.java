package o1_final;

public class Panda {
    final static String name = "Ronda";
    static final int bamboo;

    final int i;
//    static final double height; // DOES NOT COMPILE

    static {
        bamboo = 5;
    }

    {
        i = 9;
    }
}
