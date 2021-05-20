package exam_questions.streams;

import java.util.stream.IntStream;

public class Test8 {
    public static void main(String[] args) {
        int res = 1;
        IntStream stream = IntStream.rangeClosed(1, 5);
        /*INSERT*/
        System.out.println(stream.reduce(1, (i, j) -> i * j)); //ok
//                System.out.println(exam_questions.streams.stream.reduce(0, Integer::multiply)); //not
        //        System.out.println(exam_questions.streams.stream.reduce(1, Integer::multiply)); //not
        //        System.out.println(exam_questions.streams.stream.reduce(res, (i, j) -> i * j)); //ok
        //        System.out.println(exam_questions.streams.stream.reduce(0, (i, j) -> i * j)); //not
    }
}
//    Which of the following options can replace /*INSERT*/ such that on executing Test
//    class, 120 is printed in the output?
//        NOTE: 120 is the multiplication of numbers from 1 to 5. Select 2 options.


//Integer class doesn't have 'multiply' method, hence options containing
// 'Integer::multiply' will cause compilation failure.
//
//To understand, 'exam_questions.streams.stream.reduce(1, (i, j) -> i * j)' can be written as:
//
//int result = 1;
//for (int element : exam_questions.streams.stream) {
//    result = op.applyAsInt(result, element);
//}
//return result;
