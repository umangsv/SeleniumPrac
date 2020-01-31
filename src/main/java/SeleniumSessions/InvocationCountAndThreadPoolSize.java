package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCountAndThreadPoolSize {

	WebDriver driver;
	
	@Test
	public void test() throws InterruptedException
	{
		System.out.println("test invocation count and pool thread size");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("scroll(0,600)");		
		System.out.println("done scrolling");		
		
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,200)");		
		System.out.println("done scrolling using another script");		
		
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,-500)");		
		System.out.println("done scrolling up using scroll up script");	
		
		Thread.sleep(7000);
		
		driver.quit();
		
		
		
	}
	

}
