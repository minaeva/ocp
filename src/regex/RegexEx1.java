package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {

    public static void main(String[] args) {

        String s = "abc!=abd ++abf8_abd";

//        Pattern pattern = Pattern.compile("\\w"); //[a-Z0-9_]
//        Pattern pattern = Pattern.compile("\\W");
//        Pattern pattern = Pattern.compile("\\w{3}"); //words with length=3
        Pattern pattern = Pattern.compile("\\w{4}"); //words with length=4
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println("Position " + matcher.start() + "   " + matcher.group());
        }
    }

}
