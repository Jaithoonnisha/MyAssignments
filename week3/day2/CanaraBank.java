package week3.day2;

public abstract class CanaraBank implements Payments {

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on delivery method from Payments Interface");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payment methods from Payment Interface");
		
	}
	
	public abstract void recordPaymentDetails();
	
	
	

}
