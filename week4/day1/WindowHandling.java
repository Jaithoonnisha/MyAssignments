package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		//opens in guest mode
		op.addArguments("guest");
		//disable any notifications while test executions
		op.addArguments("--disable-notifications");
		//Maximize the browser
		op.addArguments("--start-maximized");
		ChromeDriver cd = new ChromeDriver(op);
		cd.get("http://leaftaps.com/opentaps/control/login");
		//Implicit wait
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Login
		cd.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		cd.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		cd.findElement(By.className("decorativeSubmit")).click();
		//finding crm/sfa button by parent xpath
		cd.findElement(By.xpath("//div[@id='label']/a")).click();
		//Moving to contact module
		cd.findElement(By.xpath("//a[text()='Contacts']")).click();
		//Click on merge contact module
		cd.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//selecting from contact
		cd.findElement(By.xpath("(//img[@width='15'])[1]")).click();
		Thread.sleep(3000);
		//Handling multiple  window
		Set<String> fromContact = cd.getWindowHandles();
		List<String> fromContactList = new ArrayList<String>(fromContact);
		cd.switchTo().window(fromContactList.get(1));
		//Selecting first contact from new tab
		cd.findElement(By.xpath("(//div[contains(@class,'firstName')])[2]")).click();
		Thread.sleep(3000);
		//Switching to parent window
		cd.switchTo().window(fromContactList.get(0));
		//selecting to contact
		cd.findElement(By.xpath("(//img[@width='15'])[2]")).click();
		//Handling multiple window
		Set<String> toContact = cd.getWindowHandles();
		List<String> toContactsList = new ArrayList<String>(toContact);
		//Switching control to new tab
		cd.switchTo().window(toContactsList.get(1));
		//Selecting second contact
		cd.findElement(By.xpath("(//div[contains(@class,'firstName')])[3]")).click();
		//Switching control to parent tab
		cd.switchTo().window(toContactsList.get(0));
		cd.findElement(By.xpath("//a[text()='Merge']")).click();
		//Handling alert
		Alert alert = cd.switchTo().alert();
		alert.dismiss();
		String s = cd.getTitle();
		
		
		if(s.contains("Contacts"))
		{
			System.out.println("The window handle control is switched back to parent window");
		}
		else
		{
			System.out.println("The window handle is not switched to parent window");
		}
		cd.quit();
		
		
		
		

	}

}
