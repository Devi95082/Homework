package factorymethod;

public class FactoryMethod
{

    public static void main(String[] args) 
    {
        NotificationFactory ef = new EmailNotification();
        Notification email = ef.creatNotification();
        email.sendMessage();
        
         NotificationFactory sf = new SMSNotification();
        Notification sms = sf.creatNotification();
        sms.sendMessage();
        
         NotificationFactory pf = new PushNotification();
        Notification push = pf.creatNotification();
        push.sendMessage();
    }
    
}
