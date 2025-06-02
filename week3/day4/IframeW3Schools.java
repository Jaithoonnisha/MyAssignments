package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeW3Schools {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("guest");
		ChromeDriver cd = new ChromeDriver(op);
		cd.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.switchTo().frame("iframeResult");
		cd.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = cd.switchTo().alert();
		alert.sendKeys("Jaithoon");
		alert.dismiss();
		String s = cd.findElement(By.xpath("//p[@id='demo']")).getText();
		if(s.contains("cancelled"))
		{
			System.out.println("The user has dismissed the alert");
		}
		else
		{
			System.out.println("The user has accepted the alert");
		}
 
		//System.out.println("Alert action message: " + s);
		
		
		
	}

}
