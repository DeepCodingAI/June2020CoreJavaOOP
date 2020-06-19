package payment;

public class MakePayment {

	public static void main(String[] args) {
		PaymentServices paymentServices = new PaymentServices();
		paymentServices.processPayment("Paypal");

	}

}
