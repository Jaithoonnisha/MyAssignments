package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeClassRoom {

	public static void main(String[] args) {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(op);
		// open url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Switching the the frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		String s = driver.findElement(By.xpath("//button[text()='Try it']/following::p")).getText();
		System.out.println("The message after accepting the alert: "+s);
		if(s.equals("You pressed OK!"))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Try again");
		}
		driver.close();
		
	}

}
