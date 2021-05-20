package exam_questions.resource_bundle;

//1. ResourceBundle.properties
//    locale=French/Canada
//2. ResourceBundle_CA.properties
//    locale=Canada
//3. ResourceBundle_hi.properties
//    locale=Hindi
//4. ResourceBundle_fr.properties
//    locale=India

import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test4 {
    public static void main(String[] args) {
        //Default Locale is: fr_CA
        Locale.setDefault(new Locale("fr", "CA"));
        //passed Locale to getBundle method is: en_IN
        Locale loc = new Locale("en", "IN");
        //Base resource bundle file name should be 'ResourceBundle'.
        ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle", loc);
        System.out.println(rb.getObject("locale"));

    }
}
//The search order for matching resource bundle is:
//ResourceBundle_en_IN.properties [1st: Complete en_IN].
//ResourceBundle_en.properties [2nd: Only language en].
//ResourceBundle_fr_CA.properties [3rd: Complete default Locale fr_CA].
//ResourceBundle_fr.properties [4th: Language of default Locale fr].
//ResourceBundle.properties [5th: ResourceBundle's name without language or country].
//
//Out of the given resource bundles, 'ResourceBundle.properties' matches.
//This resource bundle has key 'locale' and value 'French/Canada'.
//rb.getObject("locale") prints 'French/Canada' on to the console.
