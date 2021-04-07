package multithreading;

public class CreateThreadRunnable {
    public static void main(String[] args) {
        Thread myThread1 = new Thread(new MyThread3());
        Thread myThread2 = new Thread(new MyThread4());

        myThread1.start();
        myThread2.start();
    }
}


class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++)
            System.out.println(i);
    }
}

class MyThread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--)
            System.out.println(i);
    }
}
