package with;

public interface PaymentMethod {
    void processPayment();

}
class CreditCardPayment implements PaymentMethod{

    @Override
    public void processPayment() {
        System.out.println("process with Credit card");
    }
    class PaypalPayment implements PaymentMethod{

        @Override
        public void processPayment() {
            System.out.println("process with Paypal");
        }
    }

}


