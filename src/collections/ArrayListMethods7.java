package collections;

import java.util.ArrayList;

public class ArrayListMethods7 {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("0");
        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");
        arrayList1.add("4");
        arrayList1.add("5");

        System.out.println("arrayList " + arrayList1);

        Object[] array = arrayList1.toArray();
        for (Object s: array) {
            System.out.println(s);
        }

        String[] array2 = arrayList1.toArray(new String[5]);
        for (String s: array2) {
            System.out.println(s);
        }

        String[] array3 = arrayList1.toArray(new String[8]);
        for (String s: array3) {
            System.out.println(s);
        }
    }
}
