package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("guests");
		
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(3000);
		//account creation
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Jaithoon.auto account1");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//click create account
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(4000);
		String title=driver.getTitle();
		System.out.println("Title "+ title);
		
		driver.close();
		//http://leaftaps.com/crmsfa/control/main?externalLoginKey=EL802409329516
		
		
		   

	}

}
