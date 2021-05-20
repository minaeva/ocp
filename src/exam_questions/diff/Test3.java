package exam_questions.diff;

class Player {
    String name;
    int age;

    Player() {
        this.name = "Yuvraj";
        this.age = 36;
    }

    public String toString() {
        return name + ", " + age;
    }

//    public Class getClass() {//getClass is final
//        return super.getClass();
//    }
    //getClass(), notify(), notifyAll() and overloaded wait methods
    // are final in Object class and hence cannot be overridden.
}

public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Player());
    }
}
