package o4_interfaces;

public interface O4_Run {
    public default int getSpeed() {
        return 10;
    }

    static int getNumber() {return 15;}
}
