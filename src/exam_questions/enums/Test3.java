package exam_questions.enums;

enum ShapeType {
    CIRCLE, SQUARE, RECTANGLE;
}

abstract class Shape {
    private ShapeType type = ShapeType.SQUARE; //default ShapeType

    Shape(ShapeType type) {
        this.type = type;
    }

    public ShapeType getType() {
        return type;
    }

    abstract void draw();
}

public class Test3 {
    public static void main(String[] args) {
//        Shape shape = new Shape() {//compile error
        Shape shape = new Shape(ShapeType.CIRCLE) {
            @Override
            void draw() {
                System.out.println("Drawing a " + getType());
            }
        };
        shape.draw();
    }
}
