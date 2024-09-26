package InterFace;

public class Car implements InterfaceExample { //remember to put implements instead of extends
    @Override
    public void turnLeft(){
        System.out.println("The car is turning left");
    }

    @Override
    public void turnRight(){
        System.out.println("The car is turning right");
    }
}
