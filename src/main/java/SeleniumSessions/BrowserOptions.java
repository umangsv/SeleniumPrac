package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOptions {

	WebDriver driver;
	
	@Test
	public void Options()
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 

		 
		// disable infobar is now deprecated 
		
		//options.addArguments("disable-infobars");
	
		options.addArguments("headless");
		
		driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		
		
		
		
	}
	
	
}
