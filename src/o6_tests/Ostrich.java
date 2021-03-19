package o6_tests;

public class Ostrich {
    private int count;

    private interface Wild {
    }

    static class OstrichWrangler implements Wild {
        public int stampede() {
//            return count; count is non static
            return 1;
        }
    }
}
