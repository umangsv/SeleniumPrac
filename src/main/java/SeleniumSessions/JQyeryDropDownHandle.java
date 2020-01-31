package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQyeryDropDownHandle {
	
	@Test
	public void JqueryDrpDown()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
			
		//selectChoiceValues(driver,"choice 2", "choice 2 3", "choice 6 2 3");
		
		selectChoiceValues(driver, "ALL");
		
//		selectChoiceValues(driver,"choice 2 3");
//		selectChoiceValues(driver,"choice 6 2 3");
		
		
	}
	
	public static void selectChoiceValues(WebDriver driver, String... value) {
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li//span[@class='comboTreeItemTitle']"));
		
		for (WebElement choice : list) {
			
			//System.out.println(choice.getText());
			
			if(!value[0].equalsIgnoreCase("ALL"))
			{
				String text = choice.getText();
				
				for (int i = 0; i < value.length; i++) {
					
					if(text.equalsIgnoreCase(value[i]))
					{
						choice.click();
						break;
					}
				}
			}
			
			// select all values here 
			else
			{
				
				try {
						choice.click();
					}
				 catch (Exception e) {
					
				}
			}
		
			
		}
		
	}
	
	

}
