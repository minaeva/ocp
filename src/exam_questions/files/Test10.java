package exam_questions.files;


class MyResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Closing");
    }
}

public class Test10 {
    public static void main(String[] args) {
        try (AutoCloseable resource = new MyResource()) { //Unhandled exception from auto-closeable resource: java.lang.Exception
        } catch (Exception e){} //<- it would work
    }
    //close() method in AutoCloseable interface has below declaration:
    //void close() throws Exception;
    //
    //MyResource class correctly overrides close() method.
    //
    //try-with-resources statement internally invokes resource.close() method.
    //
    //resource is of AutoCloseable type, so compiler checks the close() method
    // declaration of AutoCloseable interface.
    //
    //close() method in AutoCloseable interface declares to throw Exception (checked
    // exception) and hence handle or declare rule must be followed.
    //
    //As main method neither declares to throw Exception nor provides catch block for
    // Exception type, hence try-with-resources statement causes compilation error.
}
