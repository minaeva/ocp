package exam_questions.enums;

enum Flags {
    TRUE, FALSE;

    Flags() {
        System.out.println("HELLO");
    }
}

public class Test2 {
    public static void main(String[] args) {
//        Flags flags = new Flags();
    }

    //compilation error
    //new Flags() tries to invoke enum constructor but Enum constructor cannot be invoked.
}
