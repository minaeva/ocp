package o6_tests;

public interface CanRun {
    abstract public void run();

    private void testWalk() {
    }

    default void walk() {
        System.out.print("Running");
    }
}

