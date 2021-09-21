package exam_questions.class_design;

public class Test7 {

    static String s = "s";

    static class StaticInner {

        static public void innerStatMethod() {
            System.out.println(s);
        }

        void methodToTestModificators(){
//            public String string = "0";
//            private String string = "0";
            final String string = "0";
            String string22 = "0";
        }
    }

    class Inner {

//        static String str = "str";//cannot be

    }
}
