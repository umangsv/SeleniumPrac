package SeleniumSessions;

import java.util.List;
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

public class SpiceJetDropDown {

	@Test
	public void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_HyperLinkLogin")).click();
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		
		Actions ac2 = new Actions(driver);
		
		ac2.click(driver.findElement(By.xpath("//a[text()='SpiceClub Members']"))).build().perform();
		
		WebElement el = driver.findElement(By.xpath("(//a[text()='Member Login'])[2]"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Member Login'])[2]")));
		
		System.out.println("text in the element : " + el.getText());
		el.click();
	

		
	}
	
	
}
