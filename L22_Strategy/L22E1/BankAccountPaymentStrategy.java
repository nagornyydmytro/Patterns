package L22_Strategy.L22E1;

public class BankAccountPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Payment of $" + amount + " made from bank account.");
    }
}