package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.parallelStream()
                .reduce((accumulator, element) -> accumulator + element)
                .get();
        System.out.println(sumResult);

        double sumResult1 = list.parallelStream()
                .reduce((accumulator, element) -> accumulator + element)
                .get();
        System.out.println(sumResult1);

        double divideResult = list.stream()
                .reduce((accumulator, element) -> accumulator / element)
                .get();
        System.out.println(divideResult);

        double divideResult1 = list.parallelStream()
                .reduce((accumulator, element) -> accumulator / element)
                .get();
        System.out.println(divideResult1);




    }
}
