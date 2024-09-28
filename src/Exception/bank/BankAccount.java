package Exception.bank;

public class BankAccount {
    private double balance;

    //constructor
    public BankAccount(){
        balance = 0.0;
    }
    //deposit method
    public void deposit(double amount){
        balance = balance + amount;
    }

    //withdraw method
    public void withdraw(double amount) throws InsufficientBalenceException{
        if (balance < amount) {
            throw new InsufficientBalenceException("insufficient funds \n The entered amount is less then the balnce");

        }else {
            balance = balance - amount;
        }
    }
    //Getter method of balance
    public double getBalance(){
        return balance;
    }

}
