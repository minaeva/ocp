package generics;

import java.util.ArrayList;
import java.util.List;

public class SubTyping {

    public static void main(String[] args) {
        X x = new Y();
        List<X> list = new ArrayList<X>();
//        List<X> list2 = new ArrayList<Y>();


        ////***********

//        InfoA<Integer> integerInfoA = new InfoA<>(9);
        InfoA<Bus> busInfoA = new InfoA<>(new Bus());
//        System.out.println(busInfoA);
    }
}


class X {

}

class Y extends X {

}

class Bus extends Number implements I1, I2 {

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

class InfoA<T extends Number & I1 & I2> {

    private T value;

    public InfoA(T t) {
        this.value = t;
    }

    @Override
    public String toString() {
        return "[{" + value + "}]";
    }

    public T getValue() {
        return value;
    }
}

interface I1 {

}

interface I2 {

}