package exam_questions.diff;

class StaticProperty {
    private static int count = 0;

    private StaticProperty() {
        count++;
    }

    static StaticProperty getInstance() {
        return PrinterCreator.printer;
    }

    static int getCount() {
        return count;
    }

    static class PrinterCreator {
        static StaticProperty printer = new StaticProperty();
    }
}

public class Test1 {
    public static void main(String[] args) {
        StaticProperty p1 = StaticProperty.getInstance();
        StaticProperty p2 = StaticProperty.getInstance();
        StaticProperty p3 = StaticProperty.getInstance();
        System.out.println(StaticProperty.getCount());
        //1
    }

    //This is an example of Singleton class. static fields are initialize once, when
    // class loads in the memory.
    //
    //'printer' is static reference variable defined in PrinterCreator (static nested)
    // class.
    //
    //Printer p1 = Printer.getInstance(); => getInstance method loads the
    // PrinterCreator class in the memory causing 'static Printer printer = new Printer
    // ();' to get executed. object of Printer class is created and variable count is
    // incremented by 1.
    //
    //Later invocation of Printer.getInstance(); method simply returns the reference of
    // Printer object so Printer class's constructor is not invoked.
    //
    //Variable count is incremented only once.
}
