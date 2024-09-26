package InterFace;

public class InterfaceTest {
    public static void main(String[] args){

        Car car = new Car();
        Bike bike = new Bike();

        car.turnLeft();
        car.turnRight();

        bike.turnLeft();
        bike.turnRight();
    }
}
