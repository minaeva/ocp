package exam_questions.generics.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {

    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(123);
        list.add(123);
        System.out.println(summ((list)));

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(3.33);
        doubles.add(3.34);
        doubles.add(3.35);
        System.out.println(summ(doubles));

        List<String> strings = new ArrayList<>();
        strings.add("3.33");
        strings.add("33");
        strings.add("hello");
        showListInfo(strings);

        List<? super Number> objects = new ArrayList<>();
    }

    static void showListInfo(List<?> list) {
        System.out.println("list is " + list);
    }

    public static double summ(ArrayList<? extends Number> list) {
        double sum = 0;
        for (Number n: list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
