package test2;

public interface whatsappCall {
    void call();
    void mute();
    void hangUp();
}
 class audioCall implements whatsappCall{
    public void call(){
        System.out.println("caling...");
    }

    public void mute(){
        System.out.println("muting calls..");
    }

    public void hangUp(){
        System.out.println("disconnecting....");
    }
 }
class videoCall implements whatsappCall{
    public void call(){
        System.out.println("caling...");
    }

    public void mute(){
        System.out.println("muting calls..");
    }

    public void hangUp(){
        System.out.println("disconnecting....");
    }
}
