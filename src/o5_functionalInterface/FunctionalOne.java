package o5_functionalInterface;

@FunctionalInterface
public interface FunctionalOne {

    int random();

    @Override
    String toString();

    @Override
    abstract public int hashCode();

    @Override
    boolean equals(Object o);

    private void privateOne() {
        System.out.println("private");
        staticOne();
        staticTwo();
    }

    static void staticOne() {
        System.out.println("staticOne");
        staticTwo();
    }

    private static void staticTwo() {
        System.out.println("staticTwo");
    }
}
