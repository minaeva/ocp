package o6_tests;

public interface CanSprint extends CanWalk, CanRun {


    @Override
    default void walk() {
        System.out.println("to compile");
    }

    private void testWalk() {
    }

    void sprint();

    default void walk(int speed) {
        System.out.print("Sprinting");

    }
}
