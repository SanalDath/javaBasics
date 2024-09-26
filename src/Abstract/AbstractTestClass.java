package Abstract;

public class AbstractTestClass {
    public static void main(String[] args){

        Car car = new Car("honda", "city");

        car.start();
        car.stop();
        car.getMaxSpeed();
    }
}
