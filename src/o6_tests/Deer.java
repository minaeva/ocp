package o6_tests;

public class Deer {
    public static void main(String[] seasons) {
//        switch (new Diet().getFavorite()) {
        switch (new Deer().new Diet().getFavorite()) {
            case APPLES:
                System.out.print("a");
            case BERRIES:
                System.out.print("b");
            default:
                System.out.print("c");
        }
    }

    enum Food {APPLES, BERRIES, GRASS}

    protected class Diet {
        private Food getFavorite() {
            return Food.BERRIES;
        }
    }
}
