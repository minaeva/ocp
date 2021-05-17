package exam_questions.enums;

public enum Test1 {}
/*
public enum EnumTest1 implements AutoCloseable {
    ;
    @Override
    public void close() throws Exception {
        System.out.println("close");
    }
}
*/


/*enum:
- can implement interfaces YES
- can extend enum NO
- can extend class NO
- all enums implicitly extend from java.util.Enum NO */

//Java enums cannot extend from another class or enum
// but an enum can implement interfaces.
//
//All java enums implicitly extend from java.lang.Enum class
// and not from java.util.Enum class.



