package jul8;

	public class Demo {
	    public static void main(String[] args) {
	        PaymentMethod creditCard = new CreditCard("1111-2222-3333-4444", "08/2032");
	        creditCard.pay(100);
	        System.out.println(creditCard.getPaymentDetails());

	        System.out.println();

	        PaymentMethod payPal = new PayPal("asjadshazan5@gmail.com");
	        payPal.pay(50);
	        System.out.println(payPal.getPaymentDetails());
	    }
	}
	
	
	