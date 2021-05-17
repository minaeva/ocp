package exam_questions.streams;

import java.util.Arrays;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        List<String> codes = Arrays.asList("1st", "2nd", "3rd", "4th");
        System.out.println(codes
                .stream()
                .filter(s -> s.endsWith("d"))
                .reduce((s1, s2) -> s1 + s2));
    }
    //Optional[2nd3rd]

    //filter method filters all the strings ending with "d".
    //
    //'stream.reduce((s1, s2) -> s1 + s2)' returns 'Optional<String>' type, whereas
    // 'stream.reduce("", (s1, s2) -> s1 + s2)' returns 'String'.
}
