package week3.day1;

public class Safari extends Browser{
	
	public void readerMode()
	{
		System.out.println("readerMode() method, From Safari(Child) class"+"\n"+" Variable from parent class "+"\n"+"BrowserName: "+browserName+" BrowserVersion: "+browserVersion);
	}
	
	public void fullScreenMode()
	{
		System.out.println("fullScreenMode() method, From Safari(child) class");
	}

	public static void main(String[] args) {
		Safari s = new Safari();
		//Parent class method
		s.openUrl();
		s.closeBrowser();
		//Child class method
		s.readerMode();
		s.fullScreenMode();

	}

}
