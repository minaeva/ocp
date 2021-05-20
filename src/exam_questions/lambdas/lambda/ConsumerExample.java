package exam_questions.lambdas.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> supplier) {
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            cars.add(supplier.get());
        }
        return cars;
    }
    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("N", "black", 1.6));

        System.out.println(ourCars);

        changeCar(ourCars.get(0),
                car -> {car.color="red"; car.engine = 2.4;
                    System.out.println("upgraded car "+ car);});

        System.out.println(ourCars);
    }
}

