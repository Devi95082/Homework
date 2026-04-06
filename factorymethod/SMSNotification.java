package factorymethod;

public class SMSNotification extends NotificationFactory
{

    @Override
    Notification creatNotification() 
    {
        return new SMS();
    }
    
}
