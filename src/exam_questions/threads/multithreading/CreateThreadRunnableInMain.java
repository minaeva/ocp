package exam_questions.threads.multithreading;

public class CreateThreadRunnableInMain implements Runnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new CreateThreadRunnableInMain());
        thread1.start();

        for (int i = 1000; i > 0; i--)
            System.out.println(i);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++)
            System.out.println(i);
    }
}
