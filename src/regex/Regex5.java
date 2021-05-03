package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {

    public static void main(String[] args) {
        String s = "12345678912345670325987;" +
                "98765432101234560121988;" +
                "23232323232323230101444";

        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(s);
        //group - is inside (), starts from 1
//        String newS = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//        System.out.println(newS);

        while (matcher.find()) {
//            System.out.println(matcher.group());
            System.out.println(matcher.group(7)); //only cvv codes
        }
    }

}
