package Exception;

import java.util.InputMismatchException;

public class ThrowException {
    public static double divide( Object v, double u){
        if (v instanceof String){
            throw new InputMismatchException("The entered value is String \n change it to integer");
        }
        if(u == 0){
            throw new ArithmeticException("The dividend cant be zero");
        } else {
            return((Double) v ) / u;
        }
    }
    public static void main(String[] args){
            try {
                System.out.println(divide(10.0, 2.0));
            }
            catch (ArithmeticException | InputMismatchException e){
                System.out.println(e.getMessage());
            }
    }
}
