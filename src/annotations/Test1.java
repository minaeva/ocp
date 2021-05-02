package annotations;

public class Test1 {
    public static void main(String[] args) {
        Parent parent = new Child("Zaur");
        parent.showInfo();
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("Parent class, name = " + name);
    }
}

class Child extends Parent {
    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("Child class, name = " + name);
    }

}
