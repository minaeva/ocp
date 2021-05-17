package exam_questions.generics;

class T {
    @Override
    public String toString() {
        return "T";
    }
}

class Printer<T> {
    private T t;

    Printer(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return t.toString();
    }
}

public class Test2 {
    public static void main(String[] args) {
        Printer<T> obj = new Printer<>(new T());
        System.out.println(obj);

        //T
    }
}
