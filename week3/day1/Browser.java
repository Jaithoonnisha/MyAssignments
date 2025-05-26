package week3.day1;

public class Browser {

	String browserName;
	String browserVersion ;
	
	public void openUrl()
	{
		System.out.println("Open url Method, From the super class "+"\n"+"BrowserName: "+browserName+" BrowserVersion: "+browserVersion);
	}
	
	public void closeBrowser()
	{
		System.out.println("Close browser method from super class ");
	}
	
	public void navigateBack()
	{
		System.out.println("Navigate back method from super class ");
	}
	
}
