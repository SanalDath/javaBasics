package MethodOverride;

public class MethodoverrideTest {
    public static void main(String[] args){

        Car car = new Car("manuel", "suv", 200, true);

        System.out.println("The model is " + car.getModel());
        System.out.println("The type is " + car.getType());
        System.out.println("The speed" + car.getSpeed());
        System.out.println("The mode is automatic " + car.getIsAutomatic());
    }
}
