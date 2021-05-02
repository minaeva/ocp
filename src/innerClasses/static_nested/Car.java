package innerClasses.static_nested;

public class Car {
    private static int counter = 10;
    String color;
    int doors;
    Engine engine;

    public Car(String color, int doors, Engine engine) {
        this.color = color;
        this.doors = doors;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doors=" + doors +
                ", engine=" + engine +
                '}';
    }

    void getEngineCounter(){
        System.out.println("getEngineCounter " + Engine.counter);
    }

    void getHorses(){
        System.out.println("getHorses " + this.engine.horses);
    }


    public final static class Engine {
        static int counter;
        private int horses;

        public Engine(int horses) {
            this.horses = horses;
            counter++;
            System.out.println("Car.counter " + Car.counter);
            Car.counter++;
            System.out.println("counter " + counter);
            System.out.println("Car.counter " + Car.counter);
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horses=" + horses +
                    '}';
        }
    }
}


class Test {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(233);
        System.out.println(e);

        Car car = new Car("red", 2, e);
        System.out.println(car);

        car.getEngineCounter();
        car.getHorses();
    }
}
