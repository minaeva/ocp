package exam_questions.threads.threads;

import java.util.concurrent.Semaphore;

public class SemaphoreClass {

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);

        semaphore.acquire();
        semaphore.acquire();
        semaphore.acquire();
        System.out.println(semaphore.availablePermits());

        semaphore.acquire();
        System.out.println("Can't reach it");
        semaphore.release();
        System.out.println(semaphore.availablePermits());

    }
}
