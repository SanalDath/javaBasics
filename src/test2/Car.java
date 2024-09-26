package test2;

public class Car {
    private String model;
    private int speed;
    private String name;
    private String color;
    private int year;

    //constructors
    public Car(String model){
        this.model = model;
    }

    public Car(String name, String color, int year){
        this.name = name;
        this.color = color;
        this.year = year;
    }

    //methods
    public void start(){
        System.out.println(this.model + " has started");
    }

    public void accelerate() {
        System.out.println(this.model + " is accelerating");
        this.speed += 20;
    }

    public void stop() {
        System.out.println(this.model + " is stopped");
        this.speed = 0;
    }

    public void showCurrentSpeed(){
        System.out.println(this.speed);
    }

    public String toString(){
        return "Modelname : " + this.name + " color : " + this.color + " year : " + this.year;
    }
}

