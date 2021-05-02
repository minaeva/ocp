package innerClasses.inner;

public class Car2 {
    Engine2 engine;
    private String color;
    private int doors;

    public Car2(String color, int doors) {
        this.color = color;
        this.doors = doors;
        Engine2 e = new Engine2(99);
        System.out.println(e.horses);
    }

    public void setEngine(Engine2 engine) {
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


    public class Engine2 {
//        public static String string;
        public final static String string = ""; //can be
        private int horses;

        public Engine2(int horses) {
            this.horses = horses;
            System.out.println(doors);
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horses=" + horses +
                    '}';
        }
    }
}


class Test2 {
    public static void main(String[] args) {
        Car2 car = new Car2("black", 4);
        Car2.Engine2 engine2 = car.new Engine2(22);
        car.setEngine(engine2);
        System.out.println(car);

    }
}
