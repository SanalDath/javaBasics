package Strings;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string value");
        String string = input.nextLine();

        String reverseString = "";
        int length = string.length();
        System.out.println(length);

        for(int i = length - 1; i >= 0; i --){
            reverseString = reverseString + string.charAt(i);
        }
        System.out.println(reverseString);
    }
}
