package o1_final;

import java.util.ArrayList;
import java.util.List;

public class PolarBear {
    final int age = 10;
    final static int fishEaten;
    final String name;
    final List<String> names;


    static {
        fishEaten = 10;
    }

//    age = 0;

    public PolarBear() {
        name = "7";
//        name = "Robert";
        names = new ArrayList<>();
//        names = new ArrayList<>();
        names.add("1");
        names.add("2");
    }

    public PolarBear(int height) {
        this();
    }
}
