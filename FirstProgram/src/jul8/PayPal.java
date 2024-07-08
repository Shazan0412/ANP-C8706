package jul8;

public class PayPal implements PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " rupees with PayPal account " + email);
    }

    @Override
    public String getPaymentDetails() {
        return "Email: " + email;
    }
}


