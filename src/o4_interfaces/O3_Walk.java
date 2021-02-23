package o4_interfaces;

public interface O3_Walk {

    public default int getSpeed() {
        return 5;
    }

    static int getNumber() {return 1;}

}

