package factorymethod;

public class PushNotification extends NotificationFactory
{

    @Override
    Notification creatNotification() 
    {
        return new Push();
    }
    
}
