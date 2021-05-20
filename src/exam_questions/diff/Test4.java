package exam_questions.diff;

class Player1 {
    String name;
    int age;

    Player1() {
        this.name = "Virat";
        this.age = 29;
    }

    public int hashCode() {
        return 100;
    }
}

public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Player1());
        System.out.println(new Player1());
        System.out.println(new Player1());
    }
}
