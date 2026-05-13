package L22_Strategy.L22E1;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();

    customer.setPaymentStrategy(new BankAccountPaymentStrategy());
    customer.makePayment(100);

    customer.setPaymentStrategy(new PayPalPaymentStrategy());
    customer.makePayment(250);

    customer.setPaymentStrategy(new GooglePayPaymentStrategy());
    customer.makePayment(300);
  }

}