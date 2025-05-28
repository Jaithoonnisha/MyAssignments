package week3.day2;

public interface Payments {
	
	public void cashOnDelivery();
	static void upiPayments()
	{
		System.out.println("UPI Payments");
	}
	public void cardPayments();
	default void internetBanking()
	{
		System.out.println("Internet Banking");
	}

}
