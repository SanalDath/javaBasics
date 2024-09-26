package Encapsulation;

public class Car extends Encapsulation {

    private boolean active = false;

    public Car(String model, int speed, boolean active){
        super(model, speed);
        this.active = active;
    }

    public boolean getActive(){
        return active;
    }

    public void setActive(boolean active){
        this.active = active;
    }
}
