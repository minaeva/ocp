package exam_questions.lambdas;

@FunctionalInterface
interface I5 {
    void print();
}

public class Test2 {
    int i = 100;

    I5 obj1 = new I5() {
        int i = 200;

        public void print() {
//            System.out.println(this.i);//prints 200
            System.out.println(i);//prints 200
        }
    };

    I5 obj2 = () -> {
//        int three = 300;
//        System.out.println(three); //prints 200 \n 300
//        System.out.println(this.three); //NOT COMPILE
        int i = 300;
        System.out.println(this.i); //prints 100
        System.out.println(i); //prints 300
    };

    public static void main(String[] args) {
        Test2 ques = new Test2();
        ques.obj1.print();
        ques.obj2.print();
    }

    //Keyword this within anonymous inner class code refers to the instance of
    // anonymous inner class itself, so this.i in anonymous inner class code is 200.
    //
    //Whereas, keyword this within exam_questions.lambdas.lambda expression refers to the instance of
    // enclosing class where exam_questions.lambdas.lambda expression is written, so this.i in exam_questions.lambdas.lambda
    // expression is 100.
}
