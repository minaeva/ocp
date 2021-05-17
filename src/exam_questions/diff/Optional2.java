package exam_questions.diff;

import java.io.Console;
import java.util.Optional;

public class Optional2 {
    public static void main(String[] args) {
        Optional<Console> optional = Optional.ofNullable(System.console());
        if (optional.isPresent()) {
            System.out.println("GET " + optional.get());
        }
    }
    /*
    * 1. If JVM is associated with the Console
    * (such as running above code from command prompt/window):
    * System.console() will return the Console object,
* optional.isPresent() will return true
* and System.out.println(optional.get()); will print the Console reference (such as java.io.Console@48140564).
* 2. If JVM is not associated with the Console (such as running above code from an IDE or online):
* System.console() will return null and Optional.ofNullable(System.console()); returns an EMPTY Optional.

For EMPTY optional, optional.isPresent() returns false
* and System.out.println(optional.get()); will not get executed.
* So you may not get any output in this case.

In both the cases, optional reference will always refer to some Optional object
* and will never be null. NullPointerException can't be thrown by calling methods on optional reference.*/
}
