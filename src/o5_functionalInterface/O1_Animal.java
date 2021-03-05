package o5_functionalInterface;

public class O1_Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public O1_Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }
}
