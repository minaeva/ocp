package exam_questions.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test13 {

    /*public static void main(String[] args) {
        Optional<List<String>> opt = Optional.empty();
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        opt = Optional.of(stringList);
    }*/


    public static void main(String[] args) {
        Optional<String> s = Optional.of("input");
        System.out.println(s.map(Test13::getOutput));
        System.out.println(s.flatMap(Test13::getOutputOpt));

        String fname="C:\\textfiles\\db\\query\\query.txt";
        String split[]  = fname.split("\\\\");
        System.out.println(" :: value " + split[0] );
//        System.out.println(s.flatMap(Test13::getOutput1));
    }

    static String getOutput(String input) {
        return input == null ? null : "output for " + input;
    }
    static String getOutput1(String input) {
        return input == null ? null : "output for " + input;
    }

    static Optional<String> getOutputOpt(String input) {
        return input == null ? Optional.empty() :
                Optional.of("optional output for " + input);
    }

}
