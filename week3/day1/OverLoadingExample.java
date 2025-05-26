package week3.day1;

public class OverLoadingExample {
	public void reportStep(String message, String status)
	{
		System.out.println("Message : "+message+"\n"+"Status : "+status);
	}
	
	public void reportStep(String message, String status,boolean snap)
	{
		System.out.println("Message : "+message+"\n"+"Status : "+status);
		
		if(snap)
		{
			System.out.println("Snapshot taken");
		}
		else
		{
			System.out.println("No snapshot required");
		}
	}

	public static void main(String[] args) {
		
		OverLoadingExample ol = new OverLoadingExample();
		ol.reportStep("method1", "success");
		ol.reportStep("method2", "success", true);

	}

}
