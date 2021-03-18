package o5_functionalInterface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class O3_Count {

    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<Integer>(Arrays.asList(7, 1, 27, 3, 99, 5));
        counts(aList);
        printList(aList);

        List<Integer> aList2 = Arrays.asList(7, 1, 27, 3, 99, 5);
        aList2.sort(Comparator.naturalOrder());
        printList(aList2);
    }

    private static void counts(List<Integer> list) {
        list.sort((var x, var y) -> x.compareTo(y));
    }

    private static void printList(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
