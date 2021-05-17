package exam_questions.resource_bundle;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test2 {

    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("TestFolder/Message.properties");
        prop.load(fis);
        //    Below is the content of 'Message.properties' file:
        //    key1=Good Morning!
        //    key2=Good Evening!
        System.out.println(prop.getProperty("key1"));
        System.out.println(prop.getProperty("key2", "Good Day!"));
        System.out.println(prop.getProperty("key3", "Good Day!"));
        System.out.println(prop.getProperty("key4"));
        //Good Morning!
        //Good Evening!
        //Good Day!
        //null

        //here are 2 overloaded versions of getProperty() method:
        //1. String getProperty(String key) => Returns value of the specified key and
        // null if value is not found.
        //
        //2. String getProperty(String key, String defaultValue) => Returns value of
        // the specified key and defaultValue if value is not found.
        //
        //'key1' and 'key2' are present in Properties file, so their corresponding
        // values are returned.
        //
        //As 'key3' is not present in the Properties file, hence 'prop.getProperty
        // ("key3", "Good Day!")' returns the defaultValue, "Good Day!" and as 'key4'
        // is not present as well, hence 'prop.getProperty("key4")' returns null.
    }
}
