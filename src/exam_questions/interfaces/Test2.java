package exam_questions.interfaces;

interface Printer1 {
    default void print() {
        System.out.println("Printer1");
    }
}

class Printer2 {
    public void print() { //<- this one is used
        System.out.println("Printer2");
    }
}

class Printer extends Printer2 implements Printer1 {

}

public class Test2 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(); //Printer2
    }
}
