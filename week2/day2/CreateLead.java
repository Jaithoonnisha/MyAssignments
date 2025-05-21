package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
		
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("jaithoon");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("nisha");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("fw");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("qa");
		
		//Click create lead
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
