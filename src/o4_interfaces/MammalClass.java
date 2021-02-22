package o4_interfaces;

public class MammalClass implements O1_Mammal, O2_Mammal {


    @Override
    public String getSpecies() {
        return "overridden";
    }

    @Override
    public void setName() {

    }

}
