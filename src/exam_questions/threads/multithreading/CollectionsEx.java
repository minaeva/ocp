package exam_questions.threads.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsEx {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }

//        List<Integer> target = new ArrayList<>();
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        Runnable runnable = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            target.addAll(source);};
            syncList.addAll(source);};

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

//        System.out.println(target);
        System.out.println(syncList);
    }
}
