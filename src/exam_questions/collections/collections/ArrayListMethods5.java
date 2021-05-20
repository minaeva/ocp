package exam_questions.collections.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("olya");
        arrayList1.add("iva");
        arrayList1.add("anna");
        arrayList1.add("peter");
        arrayList1.add("lena");
        arrayList1.add("peter");

        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("111");
        arrayList2.add("222");
        arrayList2.add("anna");
        arrayList2.add("444");

        System.out.println(arrayList1);

//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1);

        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);

//        arrayList2.retainAll(arrayList1);
//        System.out.println(arrayList1.containsAll(arrayList2));


    }

}
