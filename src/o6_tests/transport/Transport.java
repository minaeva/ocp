package o6_tests.transport;

public interface Transport {
    public int go();
    public boolean equals(Object o);
}
/*
public abstract class Transport {
    public abstract Object swim(double speed, int duration);
}
*/

/* NO
abstract interface Spaceship extends Transport {
    default int blastOff();
}
*/

