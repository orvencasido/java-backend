public class Day_Eleven_Abtraction_Act1 {
    public static void main (String [] args) {
        Payment[] payment = {
            new CreditCardPayment(),
            new GCashPayment(),
            new PayPalPayment()
        };

        for (int i = 0; i < payment.length; i++) {
            payment[i].pay();
        }
    }
}

public interface Payment {
    public void pay();
}

public class CreditCardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Paying via Credit Card...");
    }
}

public class GCashPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Paying via GCash...");
    }
}

public class PayPalPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Paying via PayPal...");
    }
}