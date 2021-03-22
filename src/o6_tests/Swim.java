package o6_tests;

interface Swim {
    default void perform() {
        System.out.print("Swim!");
    }
}

interface Dance {
    default void perform() {
        System.out.print("Dance!");
    }
}

class Penguin implements Swim, Dance {
    public static void main(String[] eggs) {
        new Penguin().doShow();
    }

    public void perform() {
        System.out.print("Smile!");
    }

    private void doShow() {
    Swim.super.perform(); //prints Swim!

    }
}
