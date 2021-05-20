package exam_questions.threads.multithreading;

public class PhoneCalls {

    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsup());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    void mobileCall() {
        synchronized (lock) {
            System.out.println(lock);
            System.out.println("Mobile call started");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ended");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println(lock);
            System.out.println("Skype call started");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ended");
        }
    }

    void whatsUpCall() {
        synchronized (lock) {
            System.out.println(lock);
            System.out.println("Whatsup call started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Whatsup call ended");
        }
    }
}

class RunnableImplMobile implements Runnable {
    @Override
    public void run() {
        new PhoneCalls().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {
    @Override
    public void run() {
        new PhoneCalls().skypeCall();
    }
}

class RunnableImplWhatsup implements Runnable {
    @Override
    public void run() {
        new PhoneCalls().whatsUpCall();
    }
}
