package exam_questions.inner_classes;

class Outer {
    private String name = "James Gosling";
//    inner class Inner {
//    abstract class Inner {
     class Inner {
        public void printName(){
//            System.out.println(this.name);
            System.out.println(name);
            System.out.println(Outer.this.name);

        }
    }
}

public class Test3 {
    public static void main(String[] args) {
        new Outer().new Inner().printName();
    }
}
//    Which of the following Inner class definition
//    inserted in the Outer class, will print 'James Gosling'
//    in the output on executing Test class?
//     class Inner {
//        public void printName(){
//            System.out.println(name);
//        }
//    }
