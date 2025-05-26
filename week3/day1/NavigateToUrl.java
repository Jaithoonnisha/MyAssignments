package week3.day1;

public class NavigateToUrl extends LoginTestData{
	
	public void openurl()
	{
		System.out.println("The given url is navigated");
	}

	public static void main(String[] args) {
		NavigateToUrl nav = new NavigateToUrl();
		//GrandParent class - TestData methods
		nav.enterCredentials("Jaithoon", "test123");
		nav.enterCredentials("Nisha", "test1234");
		nav.navigateToHomePage();
		//Parent class - LoginTestData methods
		nav.enterUsername();
		nav.enterPassword();
		//current grand child-child class
		nav.openurl();
		
		

	}

}
