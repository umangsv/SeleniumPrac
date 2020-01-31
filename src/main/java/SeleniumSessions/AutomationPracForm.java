package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracForm {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		System.out.println("Title of webpage :" + driver.getTitle());
		System.out.println("URL of page : " + driver.getCurrentUrl());
		
		driver.switchTo().frame("frame-one1434677811");
		
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Umang");
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("Sharma");
		driver.findElement(By.name("RESULT_TextField-3")).sendKeys("9986942378");
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("India");
		driver.findElement(By.name("RESULT_TextField-5")).sendKeys("Chandigarh");
		driver.findElement(By.name("RESULT_TextField-6")).sendKeys("umang@gmail.com");
		
		driver.findElement(By.id("RESULT_RadioButton-7")).click();
		
		//driver.quit();

	}

}
