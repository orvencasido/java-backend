public class Day_Eleven_Poly_Challenge {
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

public class Notification {
    public void send() {
        System.out.println("Sending...");
    }
}

public class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Email Notification Sending...");
    }
}

public class SMSNotification extends Notification {
    @Override
    public void send() {
        System.out.println("SMS Notification Sending...");
    }
}

public class SlackNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Slack Notification Sending...");
    }
}