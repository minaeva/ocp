package exam_questions.lambdas.lambda;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("22");
        arrayList.add("333");
        arrayList.add("4444");
        arrayList.add("5555");

        arrayList.removeIf((s) -> s.length() > 3);
        System.out.println(arrayList);
    }
}
