package Species;

import Creature.Creature;

public class Reptile extends Creature{
    private boolean drySkin;
    private boolean backborn;
    private boolean softShelledEggs;


    public Reptile() {
        super();
        this.drySkin = true;
        this.backborn = true;
        this.softShelledEggs = false;
    }

    public Reptile(int height, int weight, String animalType, String bloodType, boolean drySkin, boolean backborn, boolean softShelledEggs) {
        super(height, weight, animalType, bloodType);
        this.drySkin = drySkin;
        this.backborn = backborn;
        this.softShelledEggs = softShelledEggs;
    }

    public boolean isDrySkin() {
        return drySkin;
    }

    public boolean isBackborn() {
        return backborn;
    }

    public boolean isSoftShelledEggs() {
        return softShelledEggs;
    }

    @Override
    public String showInfo() {
        return "Reptile [height= " + getHeight() +", weight= " + getWeight() + ", animalType= " + getAnimalType() + ", bloodType= " + getBloodType() + ", backborn=" + backborn + ", drySkin=" + drySkin + ", softShelledEggs=" + softShelledEggs + "]";
    }

    
    
    
    

}
