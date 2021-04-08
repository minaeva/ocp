package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sveta");
        list.add("Vova");
        list.add("Iber");
        list.add("Lera");
        list.add("Ira");
        list.add("Ivan");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
