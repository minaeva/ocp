package o3_innerClasses;

public class O3_PrintNumbers {

    private int length = 5;

    public static void main(String[] args) {
        O3_PrintNumbers outer = new O3_PrintNumbers();
        outer.calculate();
    }

    public void calculate() {
        final int width = 6;
        int toChange = 2;

        class LocalClass {
            public int multiply() {
                System.out.println(length * width);
                return toChange;
            }
        }

        length++;
//        toChange++;
        LocalClass localClass = new LocalClass();
        localClass.multiply();
    }

    public void processData() {
        final int length = 5;
        int width = 10;
        int height = 2;
        class VolumeCalculator {
            public int multiply() {
                return length * width * height; // DOES NOT COMPILE
            }
        }
//        width = 2;
    }
}
