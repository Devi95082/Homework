package factorymethod;

public class Email implements Notification
{

    @Override
    public void sendMessage() 
    {
        System.out.println("Sending Email Notification...");
    }
}
