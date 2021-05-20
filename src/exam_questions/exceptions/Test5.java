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
    //assert 1 == 2 : 2 == 2; => throws AssertionError and as 2 == 2 is true, hence
    // message is set as true.
    //
    //This doesn't make any changes to cause, which is still null.
    //
    //If right side of the expression is an instance of Throwable type, then cause is
    // set to that type.
    //
    //main method catches AssertionError (though you are not supposed to handle Error
    // and its subtype) and 'ae.getCause()' returns null.
}
