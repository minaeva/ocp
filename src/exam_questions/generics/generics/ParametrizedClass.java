package exam_questions.generics.generics;

public class ParametrizedClass {

    public static void main(String[] args) {
        Info<String> stringInfo = new Info<>("nice to see you");
        System.out.println(stringInfo);

        Info<Integer> integerInfo = new Info<>(11);
        System.out.println(integerInfo);
        Integer i = integerInfo.getValue();
    }

}

class Info<T> {

    private T value;

    public Info(T t) {
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
