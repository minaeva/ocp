package o5_functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class O2_PredicateAnimal {
    public static void main(String[] args) {
// list of animals
        var animals = new ArrayList<O1_Animal>();
        animals.add(new O1_Animal("fish", false, true));
        animals.add(new O1_Animal("kangaroo", true, true));
        animals.add(new O1_Animal("rabbit", true, false));
        animals.add(new O1_Animal("turtle", false, true));

        test(5, a -> a > 5);
        test(5, a -> a > 4);
        print(animals, a -> a.canHop());
        print(animals, a -> !a.canHop());
        print(animals, (O1_Animal a) -> { return !a.canHop();});
        print(animals, (var a) -> { return !a.canHop();});
    }

    // Pass exam_questions.lambdas.lambda that does check print(animals, a -> a.canHop());
    private static void print(List<O1_Animal> animals, Predicate<O1_Animal> checker) {
        for (O1_Animal animal : animals) {

            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }

        }
    }

    private static void test(int i, Predicate<Integer> check) {
        if (check.test(i)) {
            System.out.println(i + " yes");
        } else {
            System.out.println(i + " not");
        }
    }
}
