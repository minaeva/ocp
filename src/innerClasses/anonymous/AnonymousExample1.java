package innerClasses.anonymous;

public class AnonymousExample1 {
    public static void main(String[] args) {

        Math add = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };

        Math multiply = ((a, b) -> a * b);

        System.out.println(add.doOperation(7, 6));
        System.out.println(multiply.doOperation(7, 6));
    }


    interface Math {
        int doOperation(int a, int b);
    }
}
