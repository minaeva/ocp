package exam_questions.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Test3 {
    void m1() throws java.io.IOException;
}


class C1 implements Test3 {
    public void m1(){}
}

class C2 implements Test3 {
    public void m1() throws FileNotFoundException {}
}

//class C3 implements Test3 {
//    public void m1() throws Exception {}
//}

class C4 implements Test3 {
    public void m1() throws IOException {}
}
