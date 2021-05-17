package exam_questions.exceptions;

class MyException extends RuntimeException {
}

class YourException extends RuntimeException {
}

public class Test4 {
    public static void main(String[] args) {
        try {
            throw new YourException();
//        } catch (ArithmeticException e1 |IllegalArgumentException e2){ //compile error
        } catch (MyException | YourException e1){ //is fine
//        } catch (MyException e | YourException e1){//
            System.out.println("Caught");
        }
    }
}
