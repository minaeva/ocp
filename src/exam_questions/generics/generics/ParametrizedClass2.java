package exam_questions.generics.generics;

public class ParametrizedClass2 {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("first", 22);
        System.out.println("val1 = " + pair.getV1() + ", val2 = " + pair.getV2());


        Pair<Integer, Double> pair2 = new Pair<>(33, 4.444);
        System.out.println("val1 = " + pair2.getV1() + ", val2 = " + pair2.getV2());


        OtherPair<String> otherPair = new OtherPair<>("77", "00");
    }

}

class Pair<V1, V2> {

    private V1 v1;
    private V2 v2;

    public Pair(V1 v1, V2 v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public V1 getV1() {
        return v1;
    }

    public V2 getV2() {
        return v2;
    }
}

class OtherPair<V> {

    private V v1;
    private V v2;

//    public <V> V abc(V value) {
    public V abc(V value) {
        return value;
    }

    public OtherPair(V v1, V v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
}
