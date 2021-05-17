package exam_questions.inner_classes;

public class Test1 {
    private int num1 = 100;

    public static void main(String[] args) {
        Test1 outer = new Test1();
        Test1.N inner = outer.new N();
        System.out.println(outer.num1 + inner.num2);
        //300
    }

    class N {
        private int num2 = 200;
    }
}
