package exam_questions.class_design;

class Outer2 {
    abstract static class Animal { //Line 2
        abstract void eat();
        abstract void say();
    }

    static class Dog extends Animal { //Line 6
        void eat() { //Line 7
            System.out.println("Dog eats biscuits");
        }

        @Override
        void say() {

        }
    }
}

public class Test4 {
    public static void main(String[] args) {
        Outer2.Animal animal = new Outer2.Dog(); //Line 15
        animal.eat();
    }

    //A class can have multiple static nested classes. static nested class can use all 4
    // access modifiers (public, protected, default and private) and 2 non-access modifiers
    // (final and abstract). No issues at Line 2.
    //
    //
    //
    //static nested class can extend from a class and can implement multiple interfaces so
    // Line 6 compiles fine. No overriding rules were broken while overriding eat() method,
    // so no issues at Line 7.
    //
    //
    //
    //Test class is outside the boundary of class Outer. So Animal can be referred by Outer
    // .Animal and Dog can be referred by Outer.Dog.
    //
    //Polymorphism is working in this case, super class (Outer.Animal) reference variable
    // is referring to the instance of sub class (Outer.Dog). So, no issues at Line 15 as
    // well.
    //
    //
    //
    //Test class compiles and executes successfully and prints "Dog eats biscuits" on to
    // the console.

}
