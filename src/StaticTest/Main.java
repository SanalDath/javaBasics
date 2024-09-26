package StaticTest;
import StaticTest.Test3.*;

public class Main {
    public static void main(String[] args) {
        Test3.speedUp(20);
        Test3.speedUp(90);
        Test3.showCurrentSpeed();
        Test3.stop();
    }
}
