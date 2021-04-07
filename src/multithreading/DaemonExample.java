package multithreading;

public class DaemonExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("userThread");

        DeamonThread deamonThread = new DeamonThread();
        deamonThread.setName("deamonThread");
        deamonThread.setDaemon(true);

        userThread.start();
        deamonThread.start();

        System.out.println("Main thread endss");
    }
}

class UserThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is deamon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DeamonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is deamon: " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
