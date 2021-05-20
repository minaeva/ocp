package exam_questions.class_design;

abstract class Greetings {
    abstract void greet();
}

public class Test6 {
    public static void main(String[] args) {
//        Greetings obj0 = new Greetings(); //cannot be
        Greetings obj = new Greetings() {
            @Override
            public void greet() {
                System.out.println("Hello");
            }
        };
        obj.greet();
    }
}
