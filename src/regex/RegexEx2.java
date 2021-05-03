package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {

    public static void main(String[] args) {

        String s = "FREE Clarinet Finger 345 Chart ax@ukr.net and ABAB as@yandex.ru ABBBB1 " +
                "Guide: 456346 Become +380678765656 a patron: 22 https://www.patreon.com +380908887766 WindTab " +
                "Website: " +
                "+6767 https://www.windtabmusic.com/​ AB anna@gmail.com  Flute  ABB   Clarinet ABBB   Alto Sx ABBBAB " +
                "   Tenor Sax";
//        Pattern pattern = Pattern.compile("\\w+"); //words
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b"); //exactly 2 digits
//        Pattern pattern = Pattern.compile("\\+\\d{9}\\b"); //phone number starting with + and 9 digits
//        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(net|ru|com|ua)"); //email
//        Pattern pattern = Pattern.compile("\\w\\s+\\w"); //symbol + 1 or more spaces + symbol   \\ss=[\t\n\r\f]
//        Pattern pattern = Pattern.compile("\\D{2,6}"); //from 2 to 6 non-digits
//        Pattern pattern = Pattern.compile("\\D{6,}"); //from 6 non-digits
//        Pattern pattern = Pattern.compile("AB{2,3}"); //ABB or ABBB
//                Pattern pattern = Pattern.compile("(AB){2,3}"); //ABAB or ABABAB

//        String s1 = "DABCDABABDABABABD";
//        Pattern pattern = Pattern.compile("D(AB){2,}"); //DABAB or DABABAB or DABABABAB...
//        Pattern pattern = Pattern.compile("D(AB)*"); //D DAB DABAB ...


        String s1 = "abcd abce abcfabcgabch";
//        Pattern pattern = Pattern.compile("\\Aabc"); //abc in the beginning
//        Pattern pattern = Pattern.compile("bch\\Z"); //in the end
        Pattern pattern = Pattern.compile("[a-d][e-h3-8]"); //ce cf cg ch
        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()) {
            System.out.println("Position " + matcher.start() + "   " + matcher.group());
        }
    }

}
