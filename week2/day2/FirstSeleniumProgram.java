package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		// Initiate browser
       ChromeDriver driver=new ChromeDriver();
       
       //Open the url
       driver.get("https://www.facebook.com/");
       //Maximize
       driver.manage().window().maximize();
       
       //close
       driver.close();
       
	}

}
