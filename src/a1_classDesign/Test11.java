package a1_classDesign;

public class Test11 {

    //What must be done to access an instance member from a static method?
    //
    //Since non-static vars or methods cannot be directly accessed from a static method, an instance of the class in
    // question must be created first.
    //
    String a;

    static void method() {
        Test11 test11 = new Test11();
        test11.a = "b";
        NonStatic nonStatic = new NonStatic();
        nonStatic.nonStat = "b";
    }
}

class NonStatic {

    String nonStat = "n";
}