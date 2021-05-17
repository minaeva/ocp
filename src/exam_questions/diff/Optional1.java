package exam_questions.diff;

import java.util.OptionalDouble;

class MyException extends RuntimeException {
}

public class Optional1 {
    public static void main(String[] args) {
        OptionalDouble optional = OptionalDouble.empty();
        System.out.println(optional.orElseThrow(MyException::new));
    }

    //orElseThrow throws the instance of provided Exception if optional is empty.
    //
    //
    //
    //In this case optional is an empty OptionalDouble, hence an instance of
    // MyException is thrown at runtime.
}
