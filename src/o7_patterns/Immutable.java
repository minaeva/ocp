package o7_patterns;

import java.util.ArrayList;
import java.util.List;

public class Immutable {

    private String a = "a";
    private List<String> list = new ArrayList<>();

    Immutable() {
        list.add("aaa");
        list.add("bbb");
    }

    public String getA() {
        return a;
    }

    public List<String> getList() {
        return new ArrayList<>(list);
    }
}

class TestImmutable {

    public static void main(String[] args) {
        Immutable immutable = new Immutable();
        String testString = immutable.getA();
        List<String> testList = immutable.getList();
        System.out.println(immutable.getList());
        testList.add("c");
        System.out.println(immutable.getList());
    }
}
