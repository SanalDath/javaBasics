package Exception.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        BankAccount bank = new BankAccount();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("---BANK ACCOUNT---");
            System.out.println("Press 1 to withdrew amount");
            System.out.println("Press 2 to show balance");
            System.out.println("Press 3 to deposit amount");
            System.out.println("Press 4 to quit menu");
            System.out.println("Enter the choice :");
            choice = input.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Your available balance is " + bank.getBalance());
                    System.out.println("press enter to withdrew :");
                    try {
                        System.out.println("Enter the withdrew amount :");
                        bank.withdraw(input.nextInt());
                        System.out.println("The amount is successfully withdraw");
                    } catch (InsufficientBalenceException e){
                        System.out.println(e.toString());
                    }
                    break;
                case 2 :
                    System.out.println("The account balance is :" + bank.getBalance());
                    break;
                case 3:
                    System.out.println("Enter the amount to deposit");
                    bank.deposit(input.nextInt());
                    System.out.println("The amount is deposited successfully");
                    break;
            }

        } while (choice != 4);
    }
}
