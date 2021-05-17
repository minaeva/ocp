package exam_questions.exceptions;

import java.io.IOException;

public class Test2 {
    public static void convert(String s) throws IllegalArgumentException,
            ArithmeticException, ClassCastException, IllegalAccessException,
            IOException, RuntimeException, Exception {
        if (s.length() == 0) {
            throw new RuntimeException("Length should be greater than 0.");
        }
    }

    public static void main(String[] args) {
        try {
            convert("");
            //        } catch (IOException | IllegalArgumentException e) //1 extends
            //        Runtime,
            //        // 2 extends Exception => ok
            //        {

            //        } catch (IOException | RuntimeException e) //1 extends Exception,
            //        // 2 is Runtime => OK
            //        {

            //        } catch (IOException | ArithmeticException e) //1 extends Exception,
            //        // 2 extends Runtime => OK
            //        {

            System.out.println("1");
            //        } catch (IllegalArgumentException | Exception e) //1 extends
            //        Runtime,
            //        // 2 is Exception => NOT
            //        {
            //        } catch (IllegalArgumentException | RuntimeException e) //1
            //        extends Runtime,
            //        // 2 is Runtime => NOT
            //        {

            System.out.println("1");
        } catch (RuntimeException e) { //Line 14
            System.out.println(e.getMessage()); //Line 15
        } //Line 16
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
