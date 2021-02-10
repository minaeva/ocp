package o2_enums;

public class WorkWithEnum {

    public static void main(String[] args) {
//        workWithSimpleEnum();

//        workWithEnumWithConstructor();

//        constructorRunsOnce();

        workWithDefaultMethod();
    }

    private static void workWithSimpleEnum() {
        Season spring = Season.SPRING;
        System.out.println(spring);
        System.out.println(spring == Season.SPRING);

        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        Season what = Season.valueOf("SUMMER");
        System.out.println("what? " + what);

    }

    private static void workWithEnumWithConstructor() {
        SeasonWithConstructor.SPRING.printMonths();
    }

    private static void constructorRunsOnce() {
        OnlyOne o1 = OnlyOne.ONCE;
        OnlyOne o2 = OnlyOne.ONCE;
    }

    private static void workWithDefaultMethod() {
        System.out.println(Season.SPRING.getHours());
        System.out.println(Season.WINTER.getHours());
    }
}
