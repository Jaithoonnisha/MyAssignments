package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AutomateAccountCreation {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("guests");
		
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		// Login
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//to ignore warnings --Doubt
		Thread.sleep(4000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Navigate to accounts module
		driver.findElement(By.linkText("Accounts")).click();
		// account creation
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Jaithoon.account2");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        // industry type
		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industryObj = new Select(industry);
		industryObj.selectByValue("IND_SOFTWARE");
		// ownership
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipObj = new Select(ownership);
		ownershipObj.selectByVisibleText("S-Corporation");
		//source
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sourceObj = new Select(source);
		sourceObj.selectByValue("LEAD_EMPLOYEE");
		// Marketing campaign
		WebElement market= driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select marketObj = new Select(market);
		marketObj.selectByIndex(6);
		//State
		WebElement state= driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select stateObj = new Select(state);
		stateObj.selectByValue("TX");
		//click create account
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		driver.close();
		
	}

}
