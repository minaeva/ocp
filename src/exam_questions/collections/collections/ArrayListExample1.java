package exam_questions.collections.collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample1 {

    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("olya");
        arrayList1.add("iva");
        arrayList1.add("anna");
        arrayList1.add("peter");
        System.out.println(arrayList1);
//        System.out.println(getCapacity(arrayList1));


        ArrayList<String> arrayList2 = new ArrayList<>(50);


        ArrayList<String> arrayList3 = new ArrayList<>(arrayList1);

        Collections.sort(arrayList1);
        System.out.println(arrayList1);

        Collections.reverse(arrayList1);
        System.out.println(arrayList1);

        Collections.shuffle(arrayList1);
        System.out.println(arrayList1);

    }

    static int getCapacity(List al) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }

}
