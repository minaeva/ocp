package exam_questions.enums;

public class Test4 {
    private static boolean checkStatus(STATUS status) {
        switch (status) {
            case PASS:
                return true;
            case FAIL:
                return false;
            default: {
                assert false : "<<<DANGER ZONE>>>";
                return false;
            }
        }
    }

    public static void main(String[] args) {
        checkStatus(null);
    }

    enum STATUS {
        PASS, FAIL;
    }

    //NPE
}
