package payment;

public class PaymentServices {

	public PaymentServices() {}
	
	PayWithCreditCard creditCard = new PayWithCreditCard();
	PayWithDebitCard debitCard = new PayWithDebitCard();
	PayWithPaypal payPal = new PayWithPaypal();
	
	public void processPayment(String paymentInfo) {
		if(paymentInfo.equalsIgnoreCase("CreditCard")) {
		     creditCard.processCreditCardPayment(paymentInfo);
		}else if(paymentInfo.equalsIgnoreCase("DebitCard")) {
			debitCard.processDebitCardPayment(paymentInfo);
		}else if(paymentInfo.equalsIgnoreCase("Paypal")) {
			payPal.processPaypalPayment(paymentInfo);
		}
			
	}
	
	private class PayWithCreditCard{
		
		public void processCreditCardPayment(String creditCardInfo) {
			System.out.println("Accepted Credit Card and payment was processed: " + creditCardInfo);
		}
	}
   private class PayWithDebitCard{
		
		public void processDebitCardPayment(String debitCardInfo) {
			System.out.println("Accepted Debit Card and payment was processed: " + debitCardInfo);
		}
	}
  private class PayWithPaypal{
	
	public void processPaypalPayment(String payPalInfo) {
		System.out.println("Accepted Paypal and payment was processed: " + payPalInfo);
	}
}
}
