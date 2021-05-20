package exam_questions.collections.collections;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("olya");
        arrayList1.add("iva");
        arrayList1.add("anna");
        arrayList1.add("peter");
        arrayList1.add(1,"lena");
        System.out.println(arrayList1);

//        System.out.println(arrayList1.get(1));

        arrayList1.set(1,"masha");

        System.out.println(arrayList1);

        arrayList1.remove(0);
        System.out.println(arrayList1);

    }

}
