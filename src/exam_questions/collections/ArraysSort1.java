package exam_questions.collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort1 {
        public static void main(String[] args) {
            String [] arr = {"A5", "B4", "C3", "D2", "E1"};
            Arrays.sort(arr, Comparator.comparing(s -> s.substring(1)));
            for(String str : arr) {
                System.out.print(str + " ");
            }

            //E1 D2 C3 B4 A5
        }
    }
