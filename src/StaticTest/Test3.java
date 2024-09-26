package StaticTest;

public class Test3 {
    public static int currentSpeed = 0;
    public static int maxSpeed = 100;

    public  static  void showCurrentSpeed(){
        System.out.println(currentSpeed);
    }

    public static void speedUp(int increase){
        currentSpeed += increase;
        System.out.println(currentSpeed);
        if (currentSpeed > maxSpeed) {
              System.out.println("Bro ur going too fast!!");
        } else {
            System.out.println("Speed is increased");
        }

    }
    public static void stop(){
        currentSpeed = 0;
        System.out.println(currentSpeed);
    }

}
