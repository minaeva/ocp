package stream;

import java.util.Arrays;

public class SortingExample {

    public static void main(String[] args) {
        int[] array = {3,7,6,9,2,11,5,8, 17};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
