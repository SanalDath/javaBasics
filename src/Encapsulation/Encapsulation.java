package Encapsulation;

public class Encapsulation {
    private String model;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private int speed;

    //Constructor
    public Encapsulation(String model, int speed){
        this.model = model;
        this.speed = speed;
    }
}
