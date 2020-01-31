package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootStrapDropdown2 {

	WebDriver driver;

	@Test
	public void bootStrapDropDown2()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
		
		driver.findElement(By.xpath("//button[contains(text(),'Dropdown button')]")).click();
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));
		
		for (WebElement webElement : element) {
			
			System.out.println(webElement.getText());	
		}
		
	}
	
	
	
}
