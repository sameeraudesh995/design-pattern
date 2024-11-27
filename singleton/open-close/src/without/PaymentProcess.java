package with;

public interface paymentMethod {
    void processPayment();
}

class CreditCardPayment implements paymentMethod{

    @Override
    public void processPayment() {
        System.out.println("process with credit card");
    }
}

class paypal implements paymentMethod{

    @Override
    public void processPayment() {
        System.out.println("process with paypal");

    }
}

class DebitCard implements paymentMethod{

    @Override
    public void processPayment() {
        System.out.println("process with DebitCard");

    }

    class PaymentProcess {
        public void process(paymentMethod paymentMethod){
            paymentMethod.processPayment();
        }
    }


    class Intit{
        public void main(String[] args) {
            PaymentProcess processer = new PaymentProcess();
            processer.process(new CreditCardPayment());
            processer.process(new paypal());
            processer.process(new DebitCard());
        }

    }}