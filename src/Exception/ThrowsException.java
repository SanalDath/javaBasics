package Exception;

import java.util.InputMismatchException;

public class ThrowsException {
    public static int divide() throws InputMismatchException, NumberFormatException, ArithmeticException {
        int a = Integer.parseInt("10");
        int b = Integer.parseInt("10");
        int c = a / b;
        return c;
    }
    public static void main(String[] args){

        try {
            int result = divide();
            System.out.println(result);
        } catch (NumberFormatException e){
            System.out.println("Invalid integer type");
        } catch (ArithmeticException e){
            System.out.println("Dividend cant be zero");
        }
    }
}
