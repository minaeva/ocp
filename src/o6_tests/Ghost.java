package o6_tests;

public class Ghost {
    public static void boo() {
        System.out.println("Not scared");
    }

    public static void main(String... haunt) {
//        var g = new Ghost().new Spirit() {};

        var next = new Ghost().new Spirit(); //Booo
        next.boo();



        Ghost.boo(); //Not scared
    }

    protected final class Spirit {
        public void boo() {
            System.out.println("Booo!!!");
        }
    }
}
