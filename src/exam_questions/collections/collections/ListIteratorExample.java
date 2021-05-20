package exam_questions.collections.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        String s = "MADAM";
        List<Character> list = new LinkedList<>();
        for (char c: s.toCharArray()) {
            list.add(c);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> iteratorBack = list.listIterator(list.size());

        boolean isPalindrom = true;
        while (iterator.hasNext() && iteratorBack.hasPrevious()) {
            if (iterator.next() != iteratorBack.previous()) {
                isPalindrom = false;
                break;
            }
        }

        System.out.println(isPalindrom);
    }

}
