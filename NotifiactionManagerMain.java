/*** create a java program to implement Abstraction for Notification System 
 * create one interface Notification that will have a send()
 * then create one class EmailNotification that will implement the send() 
 * it will have two variable String to, String message
 * a constructer to set both 
 * then create another class WhatsAppNotification notification which will also implement send()
 * it will have two variable String to, String message
 * a constructor to set both
 * now create another class NotificationManager which will have a static method this method will take an object 
 * of Notification
 * e.g AlertNotification (Notification service)
 * 
 * now in the Main class which will be NotificationManagerMain 
 * create an object of EmailNotification
 * and pass that to NotificationManger'sAlertNotification 
 * also create an object of WhatsAppNotification and pass the 
 * NotificationManger'sAlertNotification
 */
interface Notification{
    void send();
}
class EmailNotification implements Notification{
    String to;
    String message;
    EmailNotification(String to, String message){
        this.to = to;
        this.message = message;
    }
    @Override
    public void send() {
        System.out.println("The message is send to " + to);
        System.out.println("The message is " + message);
    }
}
class WhatsAppNotification implements Notification{
    String to; 
    String message;
    WhatsAppNotification(String to, String message){
        this.to = to;
        this.message = message;
    }
    @Override
    public void send() {
        System.out.println("This message is send to " + to);
        System.out.println("The message is " + message);
    }
}
class NotificationManager{
   static void AlertNotification(Notification service){
        service.send();
    }
} 

public class NotifiactionManagerMain {
    public static void main(String[] args){
        
        EmailNotification email  = new EmailNotification("Joseph@gamil.com", "lets join again");
        NotificationManager.AlertNotification(email);

        WhatsAppNotification whatsapp = new WhatsAppNotification("946987676", "Joining soon ");
        NotificationManager.AlertNotification(whatsapp);

    }
}
