package exam_questions.streams.stream;

import java.util.Arrays;

public class Chaining {
    public static void main(String[] args) {
        int[] array = {3, 7, 6, 9, 2, 12, 5, 8, 18};
//        int[] array = {3, 5, 7, 9};
        int res = Arrays.stream(array)
                .filter(e -> e % 2 == 1) // 3 7 5
                .map(e -> {
                    if (e % 3 == 0) e = e / 3; //1
                    return e;
                })
                .reduce((el1, el2) -> el1 + el2).getAsInt();
//                .sorted().toArray();
        System.out.println(res);
    }
}
