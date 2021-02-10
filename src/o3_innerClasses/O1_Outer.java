package o3_innerClasses;

public class O1_Outer {


    private String greeting = "Hi";

    public static void main(String[] args) {
        O1_Outer o1Outer = new O1_Outer();
        o1Outer.callInner();
        O1_Outer.Inner.Inner2 inner2 = new O1_Outer().new Inner().new Inner2();
        System.out.println(inner2.inner2);
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    protected class Inner {
        public int repeat = 3;

        public void go() {
            for (int i = 0; i < repeat; i++)
                System.out.println(greeting);
        }
        protected class Inner2 {
            public int inner2 = 2;
        }
    }
}
