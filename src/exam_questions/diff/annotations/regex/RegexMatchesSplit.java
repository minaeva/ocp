package exam_questions.diff.annotations.regex;

import java.util.Arrays;

public class RegexMatchesSplit {
    public static void main(String[] args) {
        String s = "Ivanov ivan@gmail.com, Kyiv 09099 Petrov peter@yandex.ru" +
                " Lena Lenovna Moscow lena@ua.ru";

        String s2 = "ivan@gmail.com";
        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);

        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
