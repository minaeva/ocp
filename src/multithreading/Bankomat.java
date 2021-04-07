package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Sveta", lock);
        new Employee("Vova", lock);
        new Employee("Varya", lock);
        Thread.sleep(5000);
        new Employee("Eugene", lock);
        new Employee("Peter", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " waits");
//            lock.lock();
                System.out.println(name + " is using bankomat");
                Thread.sleep(2000);
                System.out.println(name + " finished using bankomat");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " doesn't want to wait");
        }
    }
}
