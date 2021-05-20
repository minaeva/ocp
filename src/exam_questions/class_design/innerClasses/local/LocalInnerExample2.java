package exam_questions.class_design.innerClasses.local;

interface Math2 {
    int doOperation(int a, int b);
}

public class LocalInnerExample2 {
    public static void main(String[] args) {

        class Add implements Math2 {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }

        Add add = new Add();
        System.out.println(add.doOperation(7, 8));

    }

}
