package Exception;

public class ThrowableMethod {
    public static double divide(double u, double v){
        if(v == 0){
            throw new ArithmeticException("Change dividend to a non zero value");

        } else {
            return u / v;
        }
    }
    public static void main(String[] args){
        try {
            double result = divide(10,0);
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("dividend cant be zero");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
