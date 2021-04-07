package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Sveta", callBox);
        new Person("Vova", callBox);
        new Person("Peter", callBox);
        new Person("John", callBox);
        new Person("Lora", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;
    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " is waiting ");
            callBox.acquire();
            System.out.println(name + " is using the phone");
            sleep(2000);
            System.out.println(name + " has finished the call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}
