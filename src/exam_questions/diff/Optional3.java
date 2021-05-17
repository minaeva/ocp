package exam_questions.diff;

import java.util.Optional;

public class Optional3 {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.ofNullable(null);
        System.out.println(optional); //Optional.empty

        //ofNullable method creates an empty Optional object if passed argument is null.
        //
        //Optional.empty is printed on to the console for empty Optional.
    }
}
