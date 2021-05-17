package exam_questions.date_time;

import java.time.*;

public class Test1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, 11, 4);
        LocalTime time = LocalTime.of(13, 59, 59);
        ZonedDateTime dt = ZonedDateTime.of(date, time, ZoneId.of("America/New_York"));
        dt = dt.plusSeconds(1);
        System.out.println(dt.getHour() + ":" + dt.getMinute() + ":" + dt.getSecond());
        //Daylight saving time 2018 in United States (US) ends at 4-Nov-2018 2:00 AM.
        //What will be the result of compiling and executing Test class?

/*
        ZoneId current = ZoneId.systemDefault();
        System.out.println(current);
        dt = ZonedDateTime.now();
        System.out.println(dt.getDayOfMonth() + " " + dt.getHour() + ":" + dt.getMinute() + ":" + dt.getSecond());

        dt = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(dt.getDayOfMonth() + " " + dt.getHour() + ":" + dt.getMinute() + ":" + dt.getSecond());

        dt = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dt.getDayOfMonth() + " " + dt.getHour() + ":" + dt.getMinute() + ":" + dt.getSecond());
*/
    }
}
