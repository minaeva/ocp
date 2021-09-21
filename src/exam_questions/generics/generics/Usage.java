package exam_questions.generics.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Usage {
    public static void main(String[] args) {
        MyCollection<Number> mc = new MyCollection<>();
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(9);
        mc.setColl(list);
        System.out.println(mc.coll.size());
    }
}

class MyCollection<T> {
    Collection<? extends T> coll;

    void setColl(Collection<? extends T> coll) {
        this.coll = coll;
    }
}
