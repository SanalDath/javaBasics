package Abstract;

public abstract class Vehicle {
    String model, type;

    //Constructor
    public Vehicle(String model, String type){
        this.model = model;
        this.type = type;
    }

    //non abstract methods
    public void start(){
        System.out.println("The vehicle is started");
    }

    public void stop(){
        System.out.println("the vehicle is stopped");
    }

    //abstract method
    public abstract int getMaxSpeed();
}
