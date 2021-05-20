package exam_questions.interfaces;

    interface Flyable {
        void fly();
    }

public class Test1 {
        public static void main(String[] args) {
            /*INSERT*/
//            Flyable flyable = new Flyable();
//            Flyable flyable = new Flyable(){};
            Flyable flyable = new Flyable(){
                public void fly() {
                    System.out.println("fly");
                }
            };
        }
    }
//    Which of the following options can replace /*INSERT*/
//    such that there are no compilation errors?

