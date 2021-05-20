package exam_questions.lambdas;

import java.util.function.BiPredicate;

public class Test8 {
    public static void main(String[] args) {
        BiPredicate<String, String> predicate = String::equalsIgnoreCase;
        System.out.println(predicate.test("JaVa", "Java"));
    }
    //BiPredicate<T, U> : boolean test(T t, U u);
    //
    //BiPredicate interface accepts 2 type parameters and these parameters (T,U) are
    // passed to test method, which returns primitive boolean.
    //
    //In this case, 'BiPredicate<String, String> predicate' means test method will have
    // declaration: 'boolean test(String s1, String d2)'.
    //
    //'String::equalsIgnoreCase' is equivalent to '(s1, s2) -> s1.equalsIgnoreCase(s2)'
    //
    //This is an example of "Reference to an Instance Method of an Arbitrary Object of
    // a Particular Type" and not "method reference to static method".
}
