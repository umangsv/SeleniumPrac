package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotWebSite {

	WebDriver driver;
	
	@Test
	public void login() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login?loginPortalId=&loginRedirectUrl=https%3A%2F%2Fapp.hubspot.com%2Fhome-beta");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@12345");
		driver.findElement(By.id("loginBtn")).click();
		
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		
		driver.findElement(By.cssSelector("#nav-primary-contacts-branch")).click();
		driver.findElement(By.xpath("//li[@class='expandable active']//div[@class='secondary-nav expansion']//ul//li//div[contains(text(),'Contacts')]")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span[text()='Umang sharma']//ancestor::td//preceding-sibling::td/div")).click();
		
		/*
		driver.findElement(By.xpath("//span[text()='Create contact']")).click();
		
		driver.findElement(By.xpath("//input[@data-field='email']")).sendKeys("umang11@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'First name')]//parent::div//following-sibling::div//div[@class='private-form__input-wrapper']/input")).sendKeys("Umang");
		driver.findElement(By.xpath("//label[contains(text(),'Last name')]//parent::div//following-sibling::div//input")).sendKeys("sharma");
		
		Thread.sleep(7000);
		
		WebElement jobTitle = driver.findElement(By.xpath("//label[contains(text(),'Job title')]//parent::div//following-sibling::div//input"));
		
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.visibilityOf(jobTitle));
		
//		Actions ac = new Actions(driver);
//		ac.moveToElement(jobTitle).sendKeys("Test Analyst").build().perform();
		
		driver.findElement(By.xpath("//label[contains(text(),'Job title')]//parent::div//following-sibling::div//input[contains(@id,'UIFormControl')]")).sendKeys("Test Analyst");
		
		driver.findElement(By.xpath("//div[contains(text(),'Create contact')]//parent::button")).click();
		
		*/
	}
	
}
