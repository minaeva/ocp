package exam_questions.resource_bundle;

import java.util.Arrays;
import java.util.Locale;

public class Test5 {
    public static void main(String[] args) {
        Locale[] locales = Locale.getAvailableLocales();
        Arrays.stream(locales).filter(x -> x.toString().startsWith("fr"))
                .forEach(System.out::println);
        Arrays.stream(locales).filter(x -> x.getLanguage().startsWith("fr"))
                .forEach(System.out::println);
        //Language codes are stored in lower case, so syntax comparing upper case codes
        // ('FR') is ruled out.
        //
        //You are left with 3 options [working with lower case language code ('fr')].
        // 'x' in the exam_questions.lambdas.lambda expression is of Locale type and Locale class doesn't have
        // method startsWith, so 'x -> x.startsWith("fr")' causes compilation failure.

    }
}
