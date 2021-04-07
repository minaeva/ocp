package threads;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockSyncronized {
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

class Runner1 {

    private AccountSync account1 = new AccountSync();
    private AccountSync account2 = new AccountSync();

    public void firstThread() {
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            synchronized (account1) {
                synchronized (account2) {
                    AccountSync.transfer(account1, account2, random.nextInt(100));
                }
            }
        }
    }

    public void secondThread() {
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            synchronized (account2) {
                synchronized (account1) {
                    AccountSync.transfer(account2, account1, random.nextInt(100));
                }
            }
        }
    }

    public void finished() {
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total " + (account1.getBalance() + account2.getBalance()));
    }
}

class AccountSync {
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
