package Exception.bank;

public class InsufficientBalenceException extends Exception {
    private String message;

    //constructor
    public InsufficientBalenceException (String message){
        this.message = message;
    }

    //Getter method
    public String getMessage(){
        return message;
    }
}
