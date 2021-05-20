package exam_questions.class_design.innerClasses.inner;

public class Car {
    String color;
    int doors;
    Engine engine;

    public Car(String color, int doors, int horses) {
        this.color = color;
        this.doors = doors;
        this.engine = this.new Engine(horses);
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doors=" + doors +
                ", engine=" + engine +
                '}';
    }


    public class Engine {
        private int horses;

        public Engine(int horses) {
            this.horses = horses;
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
        Car car = new Car("black", 4, 233);
        System.out.println(car);

        Car.Engine e = new Car("a", 2, 333).new Engine(112);
        System.out.println(e);

//        car.getEngineCounter();
//        car.getHorses();
    }
}
