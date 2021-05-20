package exam_questions.class_design.innerClasses.local;

public class LocalInnerExample {

    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21, 5);
    }
}

class Math {

    private int a = 10;

    public void getResult(final int first, final int second) {

//        publuc int i;
//        int first = 21; //final or effectively final
//        int second = 4;

        class Divide {

            public int getResult() {
                System.out.println("a=" + a);
                return first / second;
            }

            public int getRest() {
                return first % second;
            }
        }

        Divide divide = new Divide();
        System.out.println("result " + divide.getResult());
        System.out.println("rest " + divide.getRest());
    }
}
