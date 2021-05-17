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
}

public class TestGetClass {
    public static void main(String[] args) {
        System.out.println(new Player());
    }
}
