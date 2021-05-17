package exam_questions.exceptions;

public class Test3 {
    public static void main(String[] args) {
        try { //outer
            try { //inner
                System.out.println(1 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Inner");
            } finally {
                System.out.println("Finally 1");
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer");
        } finally {
            System.out.println("Finally 2");
        }

        //Inner
        //Finally 1
        //Finally 2
    }
}
