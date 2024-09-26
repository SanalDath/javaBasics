package test2;
import java.util.Scanner;
import test1package.*;

public class Checkmul{
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            Add add = new Add();
            Mul multiply = new Mul();
            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println(add.add(num1, num2));

           int res = multiply.mul(num1,num2);
           System.out.println(res);
    }
}