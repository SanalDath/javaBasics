package Encapsulation;

public class Main {
    public static void main(String[] args){

        Car car = new Car("honda", 200, true);

        System.out.println(car.getModel()+ car.getSpeed()+ car.getActive());
    }
}
