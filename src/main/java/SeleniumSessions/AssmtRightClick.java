package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssmtRightClick {

	
	@FindBy(how = How.CSS, using = "dummy CSS")
	private	WebElement testElement;
	
	@FindBy (how =How.CLASS_NAME, using = "ClassName")
	private WebElement dropDown;
	
	
	@Test
	public void name() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions ac3 = new Actions(driver);
		ac3.contextClick(driver.findElement(By.className("context-menu-one"))).build().perform();
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-item context-menu-icon')]"));
		
		printAllValues(elements);
	}
	
	// method to print all values on right click
	
	public void printAllValues(List<WebElement> el) {
		
		for (WebElement rightClick : el) {
			
			System.out.println(rightClick.getText());	
		}
		
	}
	
	
	
}
