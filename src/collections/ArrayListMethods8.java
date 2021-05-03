package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods8 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(8, 9, 10);
        System.out.println(list1);

//        list1.add(66);

//        List<Integer> list3 = List.of(8, 9, null);


        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("0");
        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");
        arrayList1.add("4");
        arrayList1.add("5");

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(arrayList1);
        System.out.println(list2);
//        list2.add("0");
    }
}
