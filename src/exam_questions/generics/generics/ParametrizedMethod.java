package exam_questions.generics.generics;

import java.util.ArrayList;

public class ParametrizedMethod {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        int a = GenMeth.getSecondElement(arrayList);
        System.out.println(a);


        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("one");
        arrayList1.add("two");
        arrayList1.add("three");
        arrayList1.add("four");
        String s = GenMeth.getSecondElement(arrayList1);
        System.out.println(s);
    }
}

class GenMeth {

    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}
