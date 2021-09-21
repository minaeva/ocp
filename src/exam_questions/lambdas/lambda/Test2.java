package exam_questions.lambdas.lambda;

import o2_enums.Season;

interface I {
    int abc(String s);
}

public class Test2 {

    static void def(I i) {
        final String s;
        System.out.println(i.abc("hello"));
    }

    public static void main(String[] args) {
        def((s) -> s.length());
    }


    public void testEnum() {
//        enum NEWENUM{A, B, C}
        Season ss = Season.FALL;

    }
}
