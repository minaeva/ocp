package exam_questions.diff;

import java.io.*;

class Counter implements Serializable {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class Test5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Counter ctr = new Counter();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "testFiles/Counter.dat"))) {
            oos.writeObject(ctr);
        }

        new Counter();
        new Counter();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testFiles/Counter.dat"))) {
            ctr = (Counter) ois.readObject();
            System.out.println(Counter.getCount()); //3
        }

        //There is full permission to list/create/delete files and directories in C:.
        //
        //What will be the result of compiling and executing Test class?
    }
}
