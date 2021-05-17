package exam_questions.lambdas;

//fine
interface Operation<T extends Integer> {
    T operate(T x, T y);
}

//fine
//interface Operation {
//    int operate(int x, int y);
//}

//fine
//interface Operation {
//    long operate(long x, long y);
//}

public class Test1 {
    public static void main(String[] args) {
        Operation o1 = (x, y) -> x + y;
        System.out.println(o1.operate(5, 10));
    }
}


//NOT
//interface Operation<T> { //Operator '+' cannot be applied to 'java.lang.Object', 'java.lang.Object'
//    T operate(T x, T y);
//}
