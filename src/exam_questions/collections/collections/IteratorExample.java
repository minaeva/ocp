package exam_questions.collections.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("olya");
        arrayList1.add("iva");
        arrayList1.add("anna");
        arrayList1.add("peter");
        System.out.println(arrayList1);

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
//            System.out.println(iterator.next());
        }

        System.out.println(arrayList1);

    }

}
