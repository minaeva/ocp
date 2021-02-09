package o2_enums;

public class EnumInSwitch {

    public static void main(String[] args) {
        Season season = Season.SUMMER;

        switch (season) {
            case SPRING:
                System.out.println("Spring");
                break;
            case FALL:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Others");
        }
    }
}
