package exam_questions.class_design;

class X {
    public void invokeInner() {
        Y obj = new Y(); //Line 9
        obj.m(); //Line 10
    }

    class Y {
        private void m() {
            System.out.println("INNER");
        }
    }
}

public class Test5 {
    public static void main(String[] args) {
        new X().invokeInner();
    }
}
