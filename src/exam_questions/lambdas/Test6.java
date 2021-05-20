package exam_questions.lambdas;

interface Plus1 {
    String proceed(String s1, String s2);
}

interface Plus2 {
    int proceed(int s1, int s2);
}

public class Test6 {
    public static void main(String[] args) {
        Plus1 plus1 = ((s1, s2) -> s1 + s2);
        Plus2 plus2 = ((s1, s2) -> s1 + s2);

        System.out.println(plus1.proceed("a","b"));
        System.out.println(plus2.proceed(5,3));
    }
}
