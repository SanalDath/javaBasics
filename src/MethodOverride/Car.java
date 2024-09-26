package MethodOverride;

public class Car extends Vehicle {

    boolean isAutomatic = false;

    public Car(String model, String type, int speed, boolean isAutomatic){
        super(model, type, speed);
        this.isAutomatic = isAutomatic;
    }

    public boolean getIsAutomatic(){
        return isAutomatic;
    }

}
