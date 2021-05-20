package exam_questions.collections.collections;

import java.util.Arrays;

public class BinarySearch3 {

    public static void main(String[] args) {
        int[] array = {2, -3, 4, -2, 55, 6, -5};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int idx = Arrays.binarySearch(array, - 3);
        System.out.println(idx);
    }
}
