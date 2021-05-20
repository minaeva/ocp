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

//According to overriding rules, if super class / interface method declares to throw a
// checked exception, then overriding method of sub class / implementer class has
// following options:
//
//1. May not declare to throw any checked exception,
//2. May declare to throw the same checked exception thrown by super class / interface
// method,
//3. May declare to throw the sub class of the exception thrown by super class /
// interface method,
//4. Cannot declare to throw the super class of the exception thrown by super class /
// interface method.
