package o4_interfaces;

public interface O1_Mammal {

    default String getSpecies() {
        return "mammal";
    }

    void setName();
}
