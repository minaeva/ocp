package collections;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(-47);
        arrayList.add(-67);
        arrayList.add(27);
        arrayList.add(17);
        arrayList.add(-7);
        arrayList.add(-57);
        arrayList.add(-77);
        arrayList.add(97);
        arrayList.add(79);
        arrayList.add(-9);

        Collections.sort(arrayList);

        System.out.println(arrayList);

        int index = Collections.binarySearch(arrayList, 327);
        System.out.println(index);
    }

}
