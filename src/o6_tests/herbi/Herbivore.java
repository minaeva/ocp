package o6_tests.herbi;

public interface Herbivore {
    int amount = 10;
    boolean gather = true;

    static boolean eatGrass() {
        boolean a =  amount == 9;
        return gather || false;
    }

    //   protected int chew() { return 13; }
    private static void eatLeaves() {
    }

    //    int findMore() { return 2; }
    default float rest() {
        return 2;
    }

}
