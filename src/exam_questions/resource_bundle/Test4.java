package exam_questions.resource_bundle;

//1. ResourceBundle.properties
//    locale=French/Canada
//            //2. ResourceBundle_ca.properties
//            locale=Canada
//    //3. ResourceBundle_hi.properties
//    locale=Hindi
//            //4. ResourceBundle_fr.properties
//            locale=India
//    //5. Test.java

import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test4 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("fr", "CA"));
        Locale loc = new Locale("en", "IN");
        ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle", loc);
        System.out.println(rb.getObject("locale"));


        Locale [] locales = Locale.getAvailableLocales();
//        Arrays.stream(locales).filter(x -> x.toString().startsWith("fr")).forEach(System.out::println);
        Arrays.stream(locales).filter(x -> x.getLanguage().startsWith("fr")).forEach(System.out::println);
    }
}
