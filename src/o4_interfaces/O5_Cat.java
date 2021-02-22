package o4_interfaces;

public class O5_Cat implements O3_Walk, O4_Run {
    public static void main(String[] args) {
        System.out.println(new O5_Cat().getSpeed()); //1
        System.out.println(new O5_Cat().getWalkSpeed()); //5
    }

    public int getSpeed() {
        return 1;
    }

    public int getWalkSpeed() {
        return O3_Walk.super.getSpeed(); //return 5
    }
}
