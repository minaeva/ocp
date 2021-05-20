package exam_questions.lambdas.lambda;

interface I {
    int abc(String s);
}

public class Test2 {

    static void def(I i) {
        System.out.println(i.abc("hello"));
    }

    public static void main(String[] args) {
        def((s) -> s.length());
    }
}
