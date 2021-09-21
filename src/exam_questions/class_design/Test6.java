package exam_questions.class_design;

abstract class Greetings {
    abstract void greet();
}

abstract class NewYears {
}

public class Test6 {
    public static void main(String[] args) {
        NewYears obj0 = new NewYears() {
        }; //can be
        //        NewYears obj02 = new NewYears(); //cannot be
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
