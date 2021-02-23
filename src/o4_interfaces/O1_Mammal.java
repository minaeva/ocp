package o4_interfaces;

public interface O1_Mammal {

    default String getSpecies() {
        return "mammal 1";
    }

    void setName();
}
