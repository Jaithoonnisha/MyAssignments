package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AutomateFacebookRegistration {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("guests");
		ChromeDriver driver = new ChromeDriver(op);
		// open facebook
		driver.get("https://en-gb.facebook.com/");
		// maximize
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		// click create new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		// Create new account page
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jfirstname");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jlastname");
		// Storing date webelement in date object
		WebElement birthDate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dateObj = new Select(birthDate);
		dateObj.selectByValue("20");
		// Birth month selection dropdown
		WebElement birthMonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select monthObj = new Select(birthMonth);
		monthObj.selectByVisibleText("Jul");
		// Birth year
		WebElement birthYear = driver.findElement(By.id("year"));
		Select yearObj = new Select(birthYear);
		yearObj.selectByValue("1998");
		// Gender
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		// Contact details
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9812343214");
		driver.findElement(By.id("password_step_input")).sendKeys("TesT123./*");
		driver.close();
	}

}
