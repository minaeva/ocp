package exam_questions.date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test7 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2019, 1, 1, 10, 10);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(formatter.format(date));
    }
    //Tuesday, January 1, 2019
    //(no date)

    //DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL); statement returns formatter
    // to format date part.
    //
    //date is of LocalDateTime type hence it has both date part and time part.
    //
    //'formatter.format(date)' simply formats the date part and ignores time part.
    //
    //NOTE: You should be aware of other formatter related methods for the OCP exam, such
    // as: 'ofLocalizedTime' and 'ofLocalizedDateTime'
}
