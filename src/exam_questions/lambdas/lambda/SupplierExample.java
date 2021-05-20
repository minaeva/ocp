package exam_questions.lambdas.lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {
    public static ArrayList<Car> createThreeCars(Supplier<Car> supplier) {
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            cars.add(supplier.get());
        }
        return cars;
    }
    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("nissan", "black", 1.6));

        System.out.println(ourCars);
    }
}


class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
