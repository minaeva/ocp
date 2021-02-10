package o3_innerClasses;

public class O2_Enclosing {

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
        System.out.println(Nested.priceStat);
    }

    static class Nested {
        public static int priceStat = 22;
        private int price = 2;
    }
}
