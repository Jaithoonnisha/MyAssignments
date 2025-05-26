package week3.day1;

public class Chrome extends Browser{
	
	
	public void openIncognito()
	{
		System.out.println("openIncognito() method, From Chrome(Child) class");
	}
	
	public void clearCache()
	{
		System.out.println("clearCache() method, From Chrome(child) class");
	}

	public static void main(String[] args) {
		Chrome ch = new Chrome();
		//Parent class methods
		ch.openUrl();
		ch.closeBrowser();
		//Current class method
		ch.openIncognito();
		ch.clearCache();

	}

}
