package exam_questions.streams;

import java.util.ArrayList;
import java.util.List;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    boolean filter() {
        return this.x == this.y;
    }

}

public class Test4 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(0, 0));
        list.add(new Point(1, 2));
        list.add(new Point(-1, -1));

        list.stream().filter(Point::filter).forEach(System.out::println); //Line n1

//        Point(0, 0)
//        Point(-1, -1)
    }
}
