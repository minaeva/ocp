package exam_questions.collections.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods3 {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("olya");
        arrayList1.add("iva");
        arrayList1.add("anna");
        arrayList1.add("peter");

        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("111");
        arrayList2.add("222");
        arrayList2.addAll(arrayList1);


        System.out.println(arrayList1);
        System.out.println(arrayList2);

        arrayList2.addAll(1, arrayList1);
        System.out.println(arrayList2);

        int index = arrayList2.indexOf("olya");
        System.out.println("index of olya is " + index);

        index = arrayList2.lastIndexOf("olya");
        System.out.println("last index of olya is " + index);

        index = arrayList2.indexOf("olya3");
        System.out.println(index);

        System.out.println("contains olya " + arrayList2.contains("olya"));

        System.out.println(arrayList2);
        System.out.println(arrayList2.toString());

//        arrayList2.clear();
//        System.out.println(arrayList2);
    }


}
