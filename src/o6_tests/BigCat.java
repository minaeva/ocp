package o6_tests;

public interface BigCat {

//    static int hunt() { getName(); return 5; }
    static int hunt() { return 5; }

    abstract String getName();

    default void climb() { rest(); }
    private void roar() { getName();  climb(); hunt(); }
//    private static boolean sneak() { roar(); return true; }
    private int rest() { return 2; };
}
