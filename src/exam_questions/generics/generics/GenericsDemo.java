package exam_questions.generics.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {
        Shirt shirt = new Shirt("red", 25);
        TShirt tshirt = new TShirt("black", "java");

//        UniBox<Shirt> uniBox1 = new UniBox<>(shirt);
//        UniBox<TShirt> uniBox2 = new UniBox<>(tshirt);

        UniBox<? extends Number> uniBox3 = null;
        UniBox<Integer> uniBox4 = null;
        uniBox3 = uniBox4;

        List<? extends Number> nums = Arrays.asList(1, 2.0, 3L);
        List<Integer> ints = new ArrayList<>();
        nums = ints;
//        nums.

    }
}

class Shirt {
    String color;
    int length;

    public Shirt(String color, int length) {
        this.color = color;
        this.length = length;
    }
}

class TShirt {
    String color;
    String logo;

    public TShirt(String color, String logo) {
        this.color = color;
        this.logo = logo;
    }
}

class UniBox<T> {
    T thing;

    public UniBox(T thing) {
        this.thing = thing;
    }

    static <T> List<T> get() {
        return new ArrayList<>();
    }
}

class UniBoxExtendsNumber<T extends Number> {

}
