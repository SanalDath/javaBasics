package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        int num1 = 0, num2 = 0;
        float result = 0;
        boolean flag = false;
        do {
            try{


                Scanner input = new Scanner(System.in);

                System.out.println("Enter the first number");
                num1 = input.nextInt();
                System.out.println("Enter the second number");
                num2 = input.nextInt();

                result = num1 / num2;
                flag = true;
                input.close();
                System.out.println(result);

            } catch (InputMismatchException e){
                System.out.println("The input is mismatching");
            } catch (ArithmeticException err){
                System.out.println("The arithmetic operator is failed and its zero");
            } catch (Exception err){
                System.out.println("There is an exception error");
            } finally {
                System.out.println("This statement is always executed");
            }
        } while (!flag);


    }
}
