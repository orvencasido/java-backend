public class Day_Eleven_Abtraction_Act2 {
    public static void main (String [] args) {
        Notification[] notif = {
            new EmailNotification(),
            new SMSNotification(),
            new SlackNotification()
        };

        for (int i = 0; i < notif.length; i++) {
            notif[i].send();
        }
    }
}

public interface Notification {
    public void send();
}

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending via Email Notification...");
    };
}

public class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending via SMS Notification...");
    };
}

public class SlackNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending via Slack Notification...");
    };
}
