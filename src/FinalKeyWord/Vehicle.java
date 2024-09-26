package FinalKeyWord;

public class Vehicle { //final public class Vehicle (if i put final on the starting of this class it cant be inherited)
    int speed = 100; //final int speed = 100; (if i pt final in front of this variable ,it can not be accessed by sb classes)
    public void showSpeed(){ //final public void showSpeed(){ (if i put final on starting of this constructor it cannot be overridden by inherited sub class)
        System.out.println("The speed is 60");
    }
}
