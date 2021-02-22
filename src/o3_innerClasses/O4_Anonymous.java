package o3_innerClasses;

public class O4_Anonymous {

    public int admission(int basePrice) {
        SaleTodayOnly saleTodayOnly = new SaleTodayOnly() {
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - saleTodayOnly.dollarsOff();
    }

    public void sayHelloToCat(String person) {
        Cat cat = new Cat() {
            @Override
            String say() {
                return "mew";
            }
        };
        System.out.println(person + " says hello, cat replies " + cat.say());
    }

    interface SaleTodayOnly {
        int dollarsOff();
    }

    abstract class Cat {
        abstract String say();
    }
}
