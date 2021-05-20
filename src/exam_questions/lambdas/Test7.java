package exam_questions.lambdas;

import java.util.function.BiPredicate;

public class Test7 {
    public static void main(String[] args) {
        String[] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
        BiPredicate<String, String> predicate = String::startsWith;

        for (String str : arr) {
            if (predicate.negate().test(str, "A"))
                System.out.println(str);
        }

        //ab
        //bab
        //bb
        //baba
        //aba
    }
}
