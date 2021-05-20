package exam_questions.enums.enums;

import java.util.Arrays;

enum WeekDays2 {
    MONDAY("first"), TUESDAY("bad"), WEDNESDAY("middle"), THURSDAY("better"), FRIDAY(
            "much better"), SATURDAY("great"), SUNDAY("still ok");

    private String mood;

    private WeekDays2(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

enum WeekDays3 {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumWeekDays2 {
    public static void main(String[] args) {
        Today2 today = new Today2(WeekDays2.MONDAY);
        today.daysInfo();
        System.out.println(today.weekDay);

        System.out.println("==========");
        WeekDays2 w1 = WeekDays2.MONDAY;
        WeekDays2 w2 = WeekDays2.MONDAY;
        WeekDays2 w3 = WeekDays2.SATURDAY;
        System.out.println(w1 == w2);
        System.out.println(w1 == w3);
        //        System.out.println(w1==WeekDays3.FRIDAY);
        System.out.println("==========");
        System.out.println(WeekDays2.FRIDAY.equals(WeekDays3.FRIDAY));

        System.out.println("==========");
        WeekDays2 w4 = WeekDays2.valueOf("MONDAY");
        //        WeekDays2 w5 = WeekDays2.valueOf("monday");
        System.out.println(w4);

        System.out.println("==========");
        WeekDays2[] array = WeekDays2.values();
        System.out.println(Arrays.toString(array));
    }
}

class Today2 {
    WeekDays2 weekDay;

    public Today2(WeekDays2 weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("work");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("rest");
                break;
        }
        System.out.println("mood is " + weekDay.getMood());
    }
}
