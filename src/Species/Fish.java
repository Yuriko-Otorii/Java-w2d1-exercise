package Species;

import Creature.Creature;

public class Fish extends Creature{
    private boolean liveInWater;
    private boolean hasGills;
    
    
    
    public Fish() {
        super();
        this.liveInWater = true;
        this.hasGills = true;
    }

    public Fish(int height, int weight, String animalType, String bloodType, boolean liveInWater, boolean hasGills) {
        super(height, weight, animalType, bloodType);
        this.liveInWater = liveInWater;
        this.hasGills = hasGills;
    }



    public boolean isLiveInWater() {
        return liveInWater;
    }

    public boolean isHasGills() {
        return hasGills;
    }

    @Override
    public String showInfo() {
        return "Fish [height= " + getHeight() +", weight= " + getWeight() + ", animalType= " + getAnimalType() + ", bloodType= " + getBloodType() + ", hasGills= " + hasGills + ", liveInWater= " + liveInWater + "]";
    }
    
    


}

