package o4_interfaces;

public abstract class O01_MammalAbstractClass implements O1_Mammal, O2_Mammal{

    @Override
    public String getSpecies() {
        return "abstract mammal";
    }
}
