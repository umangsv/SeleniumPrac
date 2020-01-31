package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformActions {

	@Test
	public void name() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("http://mrbool.com/");
//		
//		Actions action = new Actions(driver);
//		
//		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.linkText("COURSES")).click();
//		
//		Thread.sleep(3000);
		
//		driver.navigate().to("https://jqueryui.com");
//		
//		driver.findElement(By.linkText("Droppable")).click();
//		
//		driver.switchTo().frame(0);
//		
//		//driver.switchTo().frame("");
//		
//		
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		
//		Actions ac = new Actions(driver);
//		ac.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		// another method for drag and drop
		//ac.dragAndDrop(drag, drop).build().perform();
		
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions ac3 = new Actions(driver);
		ac3.contextClick(driver.findElement(By.className("context-menu-one"))).build().perform();
		
		String text = driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-copy')]")).getText();
		System.out.println(text);
		
		
	}
	
	
}
