package exam_questions.date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test6 {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.now();
        LocalDateTime t2 = LocalDateTime.now();
        LocalDate t3 = LocalDate.now();
        LocalDate t4 = LocalDate.now();
//        System.out.println(Duration.between(t2, t1));
        //runtime error

        System.out.println(Duration.between(t1, t2));//fine: LocalTime and LocalDateTime
//        System.out.println(Duration.between(t3, t4));//error in jdk


        //Unable to obtain LocalDateTime from TemporalAccessor: 12:49:31.615961 of type java.time.LocalTime

    //Signature of between method defined in Duration class is: 'Duration between
        // (Temporal startInclusive, Temporal endExclusive)'.
        //
        //As both LocalTime and LocalDateTime implement 'Temporal' interface, hence
        // there is no compilation error.
        //
        //If the Temporal objects are of different types as in this case, calculation
        // is based on 1st argument and 2nd argument is converted to the type of 1st
        // argument.
        //
        //1st argument, 't2' is of LocalDateTime and 2nd argument, 't1' is of LocalTime
        // . At runtime it is not possible to convert LocalTime to LocalDateTime and
        // hence exception is thrown at runtime.
    }
}
