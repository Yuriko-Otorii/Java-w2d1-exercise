package Animal;

import Species.Reptile;

public class Crocodile extends Reptile{
    private boolean hardShelledEggs;


    public Crocodile(){
        super();
        this.hardShelledEggs = true;
    }

    public Crocodile(int height, int weight,String animalType, String bloodType, boolean hardShelledEggs, boolean drySkin, boolean backborn, boolean softShelledEggs) {
        super(height, weight, animalType, bloodType, drySkin, backborn, softShelledEggs);
        this.hardShelledEggs = hardShelledEggs;

    }


    public boolean isHardShelledEggs() {
        return hardShelledEggs;
    }

    @Override
    public String showInfo() {
        return "Crocodile [height= " + getHeight() +", weight= " + getWeight() + ", animalType= " + getAnimalType() + ", bloodType= " + getBloodType() + ", drySkin= " + isDrySkin() + ", backborn= " + isBackborn() + ", softShelledEggs= " + isSoftShelledEggs() + ", hardShelledEggs= " + isHardShelledEggs() + "]";
    }

    
    
    

}
