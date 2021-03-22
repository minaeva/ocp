package o6_tests;

public class Bear {
    public static void main(String[] args) {
        System.out.print(FOOD.INSECTS);
        System.out.print(FOOD.INSECTS.ordinal());
        System.out.print(FOOD.INSECTS.isHealthy());
        System.out.print(FOOD.COOKIES.isHealthy());
    }

    enum FOOD {
        BERRIES {
            public boolean isHealthy() {
                return false;
            }
        },
        INSECTS {
            public boolean isHealthy() {
                return true;
            }
        },
        FISH, ROOTS, COOKIES, HONEY;

        public boolean isHealthy() {
            return false;
        }
    }
}
