package multithreading;

public class NameAndPriority {

    public static void main(String[] args) {
        MyThread5 thread = new MyThread5();
        thread.setName("sveta");
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of thread5 = " + thread.getName() +
                ", priority = " + thread.getPriority());
    }
}

class MyThread5 extends Thread{
    @Override
    public void run() {
        System.out.println("Run");
    }
}
