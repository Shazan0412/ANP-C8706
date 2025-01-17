package jul8;

public class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String expirationDate;

    public CreditCard(String cardNumber, String expirationDate) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " rupees with credit card " + cardNumber);
    }

    @Override
    public String getPaymentDetails() {
        return "Card Number: " + cardNumber + ", Expiration Date: " + expirationDate;
    }
}

