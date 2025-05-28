package week3.day2;

public class Amazon extends CanaraBank{
	
	


	

	@Override
	public void recordPaymentDetails() {
		System.out.println("Abstract Record Payment details implemented");
		
	}

	public static void main(String[] args) {
		
		Amazon a = new Amazon();
		a.cardPayments();
		a.cashOnDelivery();
		//Call static method with class name or interface name
		Payments.upiPayments();
		//Default method should be called with object name
		a.internetBanking();
		a.recordPaymentDetails();

	

}
}
