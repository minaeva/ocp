package generics;

public class TypeErasure {

    public static void main(String[] args) {

    }

    public void abc(InfoType<String> infoType) {
        String s = infoType.getValue();
    }

//    public void abc(InfoType<Integer> intInfo) {
//        Integer s = intInfo.getValue();
//    }

}

class InfoType<T> {

    private T value;

    public InfoType(T t) {
        this.value = t;
    }

    @Override
    public String toString() {
        return "[{" + value + "}]";
    }

    public T getValue() {
        return value;
    }
}

class Parent {

    public void abc(InfoType<Integer> intInfo) {
        Integer s = intInfo.getValue();
    }
}

class Child extends Parent{
//    public void abc(InfoType<String> intInfo) {
//        String s = intInfo.getValue();
//    }

}