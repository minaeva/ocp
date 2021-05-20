package exam_questions.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

class Name {
    String first;
    String last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String toString() {
        return first + " " + last;
    }

}

public class Test11 {
    public static void main(String[] args) {
        List<Name> names = Arrays.asList(new Name("Peter", "Lee"), new Name("John",
                "Smith"), new Name("bonita", "smith"));
        System.out.println(names);//[Peter Lee, John Smith, bonita smith]

        /*INSERT*/
//        Collections.sort(names, (o1, o2) -> o1.getFirst().compareTo(o2.getFirst()));
        // [John Smith, Peter Lee, bonita smith]

//                Collections.sort(names,
        //                (o1, o2) -> o1.getFirst().compareToIgnoreCase(o2.getFirst()));
                //[bonita smith, John Smith, Peter Lee]

                //                Collections.sort(names,
//                (o1, o2) -> o1.getFirst().toUpperCase().compareTo(o2.getFirst().toUpperCase()));
                //[bonita smith, John Smith, Peter Lee]

//        Collections.sort(names,
//                (o1, o2) -> o1.getFirst().toLowerCase().compareTo(o2.getFirst().toLowerCase()));
        //[bonita smith, John Smith, Peter Lee]

        System.out.println(names);
    }
}
//Currently on executing Test class, [Peter Lee, John Smith, bonita smith] is displayed
// in the output.
//
//Which of the following options can replace /*INSERT*/ such that on executing Test
// class, [bonita smith, John Smith, Peter Lee] is displayed in the output?
//The names list must be sorted in ascending order of first name in case-insensitive
// manner.
//
//Select 3 options.
