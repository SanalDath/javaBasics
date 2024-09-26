package InterFace;

public class Bike implements InterfaceExample{

    @Override
    public void turnLeft(){
        System.out.println("The bike is turning left");
    }

    @Override
    public void turnRight(){
        System.out.println("The bike is turning right");
    }
}
