package Animal;

import Species.Birds;

public class Eagle extends Birds{

    public Eagle() {
    }

    public Eagle(int height, int weight, String animalType, String bloodType, boolean withFeathers, boolean canFly) {
        super(height, weight, animalType, bloodType, withFeathers, canFly);
    }

    @Override
    public String showInfo() {
        return "Eagle [height= " + getHeight() +", weight= " + getWeight() + ", animalType= " + getAnimalType() + ", bloodType= " + getBloodType() + ", withFeathers= " + isWithFeathers() + ", canFly= " + isCanFly() +  "]";
    }

    

    
    
    


}
