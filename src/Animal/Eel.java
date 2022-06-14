package Animal;

import Species.Fish;

public class Eel extends Fish{
    private boolean releaseElectricCharge;

    public Eel() {
        super();
        this.releaseElectricCharge = false;
    }

    public Eel(int height, int weight, String animalType, String bloodType, boolean releaseElectricCharge, boolean liveInWater, boolean hasGills) {
        super(height, weight, animalType, bloodType, liveInWater, hasGills);
        this.releaseElectricCharge = releaseElectricCharge;
    }

    public boolean isReleaseElectricCharge() {
        return releaseElectricCharge;
    }

    @Override
    public String showInfo() {
        return "Eel [height= " + getHeight() +", weight= " + getWeight() + ", animalType= " + getAnimalType() + ", bloodType= " + getBloodType() + ", liveInWater= " + isLiveInWater() + ", hasGills= " + isHasGills() + ", releaseElectricCharge= " + releaseElectricCharge + "]";
    }

    
}
