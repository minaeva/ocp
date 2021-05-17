package exam_questions.resource_bundle;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Test1 {
    public static void main(String[] args) {
        Locale loc = new Locale("en", "US");

        ResourceBundle bundle = ResourceBundle.getBundle("RB", loc);
        Enumeration<String> enumeration = bundle.getKeys();
        while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            String val = bundle.getString(key);
            System.out.println(key + "=" + val);
            //key1=ONE
            //key2=TWO
            //key3=THREE3
            //key4=THREE
            //key5=THREE
        }
    }
}
