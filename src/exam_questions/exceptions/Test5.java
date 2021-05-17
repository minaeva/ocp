package exam_questions.exceptions;

public class Test5 {
    private static void checkStatus() {
        assert 1 == 2 : 2 == 2;
    }

    public static void main(String[] args) {
        try {
            checkStatus();
        } catch (AssertionError ae) {
            System.out.println(ae.getCause());
        }
    }
    //null
}
