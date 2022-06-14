package Species;

import Creature.Creature;

public class Birds extends Creature{
    private boolean withFeathers;
    private boolean canFly;


    public Birds() {
        super();
        this.withFeathers = true;
        this.canFly = true;
    }

    
    public Birds(int height, int weight, String animalType, String bloodType, boolean withFeathers, boolean canFly) {
        super(height, weight, animalType, bloodType);
        this.withFeathers = withFeathers;
        this.canFly = canFly;
    }



    public boolean isWithFeathers() {
        return withFeathers;
    }

    public boolean isCanFly() {
        return canFly;
    }


    @Override
    public String showInfo() {
        return "Birds [height= " + getHeight() +", weight= " + getWeight() + ", animalType= " + getAnimalType() + ", bloodType= " + getBloodType() + ", canFly=" + canFly + ", withFeathers=" + withFeathers + "]";
    }
    
    

}
