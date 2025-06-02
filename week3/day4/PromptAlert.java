package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(op);
		// open url
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//finding the element of alert button
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//Changing the driver focus to handle alert
		Alert alert = driver.switchTo().alert();
		//Sending the text for alert box
		Thread.sleep(3000);
		alert.sendKeys("Jaithoon");
		//Accept the alert
		Thread.sleep(3000);
		alert.accept();
		//Getting text after accepting the alert
		String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		//Printing the text
		System.out.println("The text on accepting the alert: "+ text);
		Thread.sleep(3000);
		driver.close();

	}

}
