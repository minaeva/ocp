package o6_tests;

public class IceCream {
    public static void main(String[] args) {
        Flavors STRAWBERRY = null;
        switch (STRAWBERRY) {
            case VANILLA:
                System.out.print("v");
            case CHOCOLATE:
                System.out.print("c");
            case STRAWBERRY:
                System.out.print("s");
                break;
            default:
                System.out.println("missing flavor");
        }
    }

    enum Flavors {
        CHOCOLATE, STRAWBERRY, VANILLA
    }
}
