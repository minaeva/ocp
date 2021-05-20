package exam_questions.collections.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods6 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("0");
        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");
        arrayList1.add("4");
        arrayList1.add("5");
        arrayList1.add("6");

        List<String> myList = arrayList1.subList(1, 4);
        System.out.println(myList);

        System.out.println(arrayList1);
        myList.add("fedor");
        System.out.println("arrayList1 " + arrayList1);
        System.out.println("myList" + myList);

        arrayList1.add("sveta");
        System.out.println("arrayList1 " + arrayList1);
//        System.out.println("myList" + myList);

    }

}
