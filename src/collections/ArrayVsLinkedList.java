package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinkedList {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int start = (int) System.currentTimeMillis();
        for (int i = 0; i < 500000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
        int finish = (int) System.currentTimeMillis();
        System.out.println("two lists created " + (finish-start));

        int start1 = (int) System.currentTimeMillis();
        for (int i = 0; i < 500000; i++){
            arrayList.add(i,250000+i);
        }
        int finish1 = (int) System.currentTimeMillis();
        System.out.println("arrayList took " + (finish1-start1));



        int start2 = (int) System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            linkedList.add(i,250000+i);
        }
        int finish2 = (int) System.currentTimeMillis();
        System.out.println("linkedList took " + (finish2-start2));

    }
}
