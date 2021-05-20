package exam_questions.threads.threads;

import java.util.Scanner;

public class Volatile {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        thread.shutdown();

    }

}


class MyThread extends Thread {

    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
