package week3.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BagsForBoysAmazon {
	

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(op);
		// open url
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//"Bags for boys" in the Search box
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys"+Keys.ENTER);
		//Getting the count displayed in ui
		String count=driver.findElement(By.xpath("//div[@class='sg-col-inner']//span")).getText();
		System.out.println("Total number of results: "+count);
		//Clicking the first two brands
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]/following-sibling::i")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]/following-sibling::i")).click();
		//clicking sort by newest arrivals
		driver.findElement(By.xpath("//span[@tabindex='-1']//following-sibling::span")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		//Getting details of first displayed bag name and price
		String name=driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus')])[1]")).getText();
		System.out.println("Name: "+ name);
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println("Price: "+price);
		String title=driver.getTitle();
		System.out.println("Title: " + title);
		driver.close();
		
		
		
		

	}

}
