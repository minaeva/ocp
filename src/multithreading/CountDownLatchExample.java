package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {
        new Friend("Sveta", countDownLatch);
        new Friend("Lev", countDownLatch);
        new Friend("Slava", countDownLatch);
        new Friend("Ron", countDownLatch);
        new Friend("Riaz", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("everythingIsReady");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("openMarket");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " started shopping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
