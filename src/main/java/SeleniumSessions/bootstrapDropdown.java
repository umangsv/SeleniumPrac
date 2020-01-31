package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootstrapDropdown {

	WebDriver driver;
	
	@Test
	public void method1()
	{
		
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
	//	List<WebElement> elements = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//a//label"));
	
		List<WebElement> elements = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li"));
		
		
		for (WebElement ele : elements) {
			
//			if(ele.getText().contains("Angular"))
//			{
//				ele.click();
//				break;
//			}
			
			// if you check the below code, it always returns false
			
//			System.out.println( ele.getText() + " is "  + ele.isSelected());		
//			if(ele.isSelected())
//			{
//				System.out.println("Element clicked is : " + ele.getText());
//				ele.click();
//			}
		
		/* 	for already selected options, we can't use isSelected() method as this method always returns false.
			So we have to use the li-class which changes the class name to "active"
		*/	
			
		System.out.println(ele.getAttribute("class").equalsIgnoreCase("active"));	
			
		if(ele.getAttribute("class").equalsIgnoreCase("active"))
		{
			System.out.println(ele.getText());
		}
		else {
			ele.click();
		}
				
		}
		
		/* 	for already selected options, we can't use isSelected() method as this method always returns false.
			So we have to use the li-class which changes the class name to "active"
		*/
	}
	
	
	
	
}
