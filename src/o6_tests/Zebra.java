package o6_tests;

public class Zebra {
    private int x = 24;

    public static void main(String[] args) {
        new Zebra().hunt();
    }

    public int hunt() {
        String message = "x is ";
        abstract class Stripes {
            private int x = 0;

            public void print() {
                System.out.println(message + Zebra.this.x);
            }
        }
        var s = new Stripes() {};
        s.print();
        return x;
    }
}
