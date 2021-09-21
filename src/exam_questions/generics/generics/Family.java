package exam_questions.generics.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Family {
    public static void main(String[] args) {
//        List<? super Pa> paArrayList = new ArrayList<>();
        List<? super Pa> paArrayList = Arrays.asList(new Pa(), new Son(), new GrandPa());
//        paArrayList.add(new Pa());
//        paArrayList.add(new Son());

        System.out.println(paArrayList.get(0).getClass().getName());
        System.out.println(paArrayList.get(2).getClass().getName());
    }
}

class GrandPa {

}

class Pa extends GrandPa {

}

class Son extends Pa {

}

