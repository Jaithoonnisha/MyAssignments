package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForceLogin {

	public static void main(String[] args) throws InterruptedException {
	   ChromeOptions op=new ChromeOptions();
	   op.addArguments("guests");
	   
       ChromeDriver driver=new ChromeDriver(op);
       driver.manage().window().maximize();
       
       driver.get("https://login.salesforce.com/?locale=in");
       Thread.sleep(2000);
       driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
       driver.findElement(By.id("password")).sendKeys("Sales@123");   
       driver.findElement(By.id("Login")).click();
       
       Thread.sleep(15000);
       String title= driver.getTitle();
       System.out.println(title);
       Thread.sleep(5000);
       driver.close();
       
       
       /*
        ClassRoom 2:
launch browser
load the url:https://login.salesforce.com/?locale=in
username:vidyar@testleaf.com
password:Sales@123
click on login
get Title of the page
click on 9 dots
Close the Browser
        */
       
       
       
	}

}
