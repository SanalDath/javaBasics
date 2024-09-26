package Inheritence;

public class InheritenceTest {
    public static void main(String[] args){

        VehicleClass car = new VehicleClass();

        car.model = "TATA";
        car.type = "SUV";
        car.speed = 230;

        car.print();

        BikeClass bike = new BikeClass();

        bike.model = "BMW";
        bike.type = "sports";
        bike.speed = 300;

        bike.print();
        bike.push();
    }
}
