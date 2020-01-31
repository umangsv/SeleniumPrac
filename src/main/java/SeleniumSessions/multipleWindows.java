package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleWindows {

	@Test
	public void method1() {

		System.out.println("lets start with this method1");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		WebElement uname = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("passwd"));
		
		uname.sendKeys("umang@infosys.com");
		password.sendKeys("chuha@789");

		
		System.out.println("value entered in the username is : " + uname.getAttribute("value"));
		System.out.println("value entered in the password is : " + password.getAttribute("value"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementByName('')[0].value", uname);
		
		
		driver.quit();
	}

}
