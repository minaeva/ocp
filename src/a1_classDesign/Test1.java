package a1_classDesign;

//True or false: instance variables and methods can be accessed by this() or super() ?
//False, because such vars and methods must be static.

class Base {
    String name = "";

    Base(String name) {
        this.name = name;
    }
}

public class Test1 extends Base {
    String test = "Test";
    static String best = "Best";

    String run() {
        return test;
    }

    static String walk() {
        return best;
    }

    Test1() {
//       super(test);     // INVALID: "cannot reference test before supertype ctor has been called"
//       super( run() );  // INVALID: "cannot reference this before supertype ctor has been called"
        super(walk());  // VALID
    }
}