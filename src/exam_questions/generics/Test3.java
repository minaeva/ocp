package exam_questions.generics;

class Printer2<String> {
    private String t;

    Printer2(String t) {
        this.t = t;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Printer2<Integer> obj = new Printer2<>(100);
        System.out.println(obj);
        //exam_questions.generics.Printer2@6b71769e

        //Printer class doesn't override toString() method and hence 'System.out.println(obj);' prints some text containing @ symbol.
    }
}
