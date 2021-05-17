package exam_questions.inner_classes;

class A1 {
    public void someMethod(final String name) {
        /*INSERT*/
//        class B {
       final class B {
            void print() {
                System.out.println("Hello " + name);
            }
        }
        new B().print();

    }
}

public class Test2 {
    public static void main(String[] args) {
        new A1().someMethod("World!");
    }
}

//    Which of the following options can replace /*INSERT*/
//        such that on executing Test class, "Hello World!" is displayed in the output?

//        class B {
//       final class B {
