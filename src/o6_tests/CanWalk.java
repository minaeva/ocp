package o6_tests;

public interface CanWalk {
    default void walk() {
        System.out.print("Walking");
    }

    private void testWalk() {
    }
}

