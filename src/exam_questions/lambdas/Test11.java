package exam_questions.lambdas;

import java.util.function.BiFunction;

public class Test11 {
    public static void main(String[] args) {
//        BiFunction<Integer, Integer, Character> compFunc = (i, j) -> i + j;
        BiFunction<Integer, Integer, Integer> compFunc = (i, j) -> i + j;
        System.out.println(compFunc.apply(0, 65));
    }
}
//NOTE:ASCII value of A is 65.
// What will be the result of compiling and executing Test class?
//comp error
