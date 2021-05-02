package enums;

enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumWeekDays {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.FRIDAY);
        today.daysInfo();
    }
}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("go work");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("rest");
                break;
        }
    }
}
