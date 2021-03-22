package o6_tests;

import java.util.List;

public interface Yawn {
    String yawn(double d, List<Integer> time);
}
class Sloth implements Yawn {
    public String yawn(double zzz, List<Integer> time) {
        return "Sleep: " + zzz;
    }
}
class Vet {
    public static String takeNap(Yawn y) {
        return y.yawn(10, null);
    }
    public static void main(String... unused) {
        System.out.println(takeNap(new Sloth()));
//        System.out.println(takeNap((f, z) -> { String x = ""; return "Sleep: " + x; }));
        System.out.println(takeNap((w,q) -> {return "Sleep: " + w;}));
        System.out.println(takeNap((a,b) -> "Sleep: " + (double)(b==null ? a : a)));
//        System.out.println(takeNap((r,k) -> { String g = ""; return "Sleep:"; }));

    }
}
