package exam_questions.threads.multithreading;

public class CreateThreadQuick {

    public static void main(String[] args) {
        new Thread(() -> {for (int i = 0; i < 1000; i++)
            System.out.println(i);}).start();

        new Thread(() -> {for (int i = 1000; i > 0; i--)
            System.out.println(i);}).start();


    }
}
