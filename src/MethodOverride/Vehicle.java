package MethodOverride;

public class Vehicle {
    String type, model;
    int speed;

    public Vehicle (String type, String model, int speed){
        this.model = model;
        this.type = type;
        this.speed = speed;
    }

    //getter methods

    public String getType(){
        return type;
    }

    public String getModel(){
        return model;
    }

    public int getSpeed() {
        return speed;
    }
}
