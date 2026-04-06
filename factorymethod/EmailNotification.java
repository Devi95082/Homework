package factorymethod;

public class EmailNotification extends NotificationFactory
{

    @Override
    Notification creatNotification()
    {
        return new Email();
    }
    
}
