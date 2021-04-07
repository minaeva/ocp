package o7_patterns;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null)
            synchronized (Singleton.class) {
                instance = new Singleton();
            }

        return instance;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();
        System.out.println(first == second);
    }
}

