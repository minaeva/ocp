package multithreading;

public class CreateThreadInMain extends Thread {

    public static void main(String[] args) {
        CreateThreadInMain thread = new CreateThreadInMain();
        thread.start();

        for (int i = 1000; i > 0; i--)
            System.out.println(i);

    }

    public void run() {
        for (int i = 1000; i > 0; i--)
            System.out.println(i);
    }
}
