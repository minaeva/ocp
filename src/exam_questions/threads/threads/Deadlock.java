package exam_questions.threads.threads;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {
    public static void main(String[] args) throws InterruptedException {
        Runner1 runner = new Runner1();

        Thread thread1 = new Thread(() -> runner.firstThread());
        Thread thread2 = new Thread(() -> runner.secondThread());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finished();
    }
}

class Runner {

    private AccountSync account1 = new AccountSync();
    private AccountSync account2 = new AccountSync();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void takeLocks(Lock lock1, Lock lock2) {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;
        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }
                if (firstLockTaken) {
                    lock1.unlock();
                }
                if (secondLockTaken) {
                    lock2.unlock();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void firstThread() {
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            takeLocks(lock1, lock2);
            try {
                AccountSync.transfer(account1, account2, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void secondThread() {
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            takeLocks(lock2, lock1);
            try {
                AccountSync.transfer(account2, account1, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished() {
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total " + (account1.getBalance() + account2.getBalance()));
    }
}

class Account {
    private int balance = 10000;

    public static void transfer(AccountSync account1, AccountSync account2, int amount) {
        account1.withdraw(amount);
        account2.deposit(amount);
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
