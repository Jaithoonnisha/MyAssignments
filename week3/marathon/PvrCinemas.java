package week3.marathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(op);
		// open url
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//click cinema
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		//select cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		//choosing theatre
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		//selecting date
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		//select movie name
		driver.findElement(By.xpath("//li[@role='option'][4]")).click();
		//show time
		driver.findElement(By.xpath("//span[text()='12:50 PM']")).click();
		//submitﬁ
		driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
		//accept the tab
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//select seat number
		driver.findElement(By.xpath("//span[@id='CL.CLUB|I:15']")).click();
		//clicking proceed
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//getting ticket details
		String ticketValue = driver.findElement(By.xpath("//div[@class='ticket-value']/p")).getText();
		String seatNumber = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		//printing ticket details
		System.out.println("Ticket value: "+ticketValue+" Seat Number: "+seatNumber);
		//getting grandtotal and printing it
		String grandTotal = driver.findElement(By.xpath("//span[text()='221.27']")).getText();
		System.out.println("Grand total: "+grandTotal);
		//click continue
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		//Getting list of webelements of the cross icon
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='cross-icon mx-2']"));
		int num=elements.size();
		System.out.println(num);
		for (WebElement webElement : elements) {
			System.out.println(webElement);	
		}
		Thread.sleep(3000);
		//Accessing the second cross icon x path to close the pop up window
		driver.findElement(By.xpath("(//div[contains(@class,'cross-icon')])[2]")).click();
		Thread.sleep(3000);
		//getting page title, printing and closing the window
		String title=driver.getTitle();
		System.out.println("Title: "+title);
		driver.close();
		
	}

}
