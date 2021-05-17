package exam_questions.date_time;

import java.time.*;

public class Test4 {
        public static void main(String[] args) {
            Instant instant = Instant.now();
//            LocalDateTime obj = null; //Line n1
//            LocalDateTime obj = LocalDateTime.of(instant); //Line n1
//            LocalDateTime obj = (LocalDateTime)instant; //Line n1
//            LocalDateTime obj = instant.toLocalDateTime(); //Line n1
            LocalDateTime obj = instant.atZone(ZoneId.systemDefault()).toLocalDateTime(); //Line n1
            System.out.println(obj);
        }
    }
//    Which of the following statements will replace null at Line n1
//    such that Instant object referred by 'instant' is converted to LocalDateTime object?

//instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
//Instant class doesn't have any method to convert to LocalDate, LocalDateTime or
// LocalTime and vice-versa. Hence, 'instant.toLocalDateTime();' and 'LocalDateTime.of
// (instant);' cause compilation error.
//
//'(LocalDateTime)instant' also causes compilation failure as LocalDateTime and Instant
// are not related in multilevel inheritance.

