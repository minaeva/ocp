package exam_questions.files;

class Resource1 implements AutoCloseable {
    public void close() {
        System.out.println("Resource1");
    }
}

class Resource2 implements AutoCloseable {
    public void close() {
        System.out.println("Resource2");
    }
}

public class Test6 {
    public static void main(String[] args) {
        try (Resource1 r1 = new Resource1(); Resource2 r2 = new Resource2()) {
            System.out.println("Test");
        }
        //Test
        //Resource2
        //Resource1

        //Classes used in try-with-resources statement must implement java.lang
        // .AutoCloseable or its sub interfaces such as java.io.Closeable.
    }
}
