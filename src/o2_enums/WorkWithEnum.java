package o2_enums;

public class WorkWithEnum {

    public static void main(String[] args) {
        Season spring = Season.SPRING;
//        System.out.println(spring);
//        System.out.println(spring == Season.SPRING);

        for (Season season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        Season what = Season.valueOf("SUMMER");
        System.out.println("what? " + what);

    }
}
