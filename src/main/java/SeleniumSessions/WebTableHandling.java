package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

	
	
	@Test
	public void JqueryDrpDown()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement tbl = driver.findElement(By.id("customers"));
		
		List<WebElement> rows = tbl.findElements(By.tagName("tr"));
		
		
		
//		for (WebElement row : rows) {
//			
//			List<WebElement> cols =  row.findElements(By.tagName("td"));
//			
//			for (WebElement col : cols) {
//				
//				System.out.print(col.getText());
//			}
//			
//			System.out.println();
//		}
		
		
		// //*[@id="customers"]/tbody/tr[2]/td[1]
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[" ;
		String afterXpath  = "]/td[1]";	
		
		
		for (int i = 2; i < rows.size()+1; i++) {
			
			String actualXpath =  beforeXpath + i + afterXpath;
			
			String value = driver.findElement(By.xpath(actualXpath)).getText();
			
			System.out.println(value);
			
			
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			//wait.until(ExpectedConditions.refreshed(ExpectedConditions))
//			
//			wait.until((ExpectedConditions.invisibilityOf(tbl)));
			
			
		}
		
	}
	
}
