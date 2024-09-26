package Abstract;

public class Car extends Vehicle{
    public Car(String model, String type){
        super(model, type);
    }

    @Override
    public int getMaxSpeed(){
        final int MAX_SPEED = 300;
        System.out.println("The max speed is " + MAX_SPEED);
        return MAX_SPEED;
    }

    @Override
    public void start(){
        System.out.println("The car is started");
    }

    @Override
    public void stop(){
        System.out.println("The car is stopped");
    }
}
