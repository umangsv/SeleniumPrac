package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {

	@Test
	public void name() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		// passing the username and password directly in URL
		// ask developer to enable authentication pop-up
		
		String username = "admin";
		String password = "admin";
		
		driver.get("http://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
	//	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		// Frames
		
		/* 
		 *      driver.switchto().defaultContent();
		 * 		driver.switchto().parentFrame();
		 * 
		 * 		How many frames are there in a webpage?
		 * 		
		 * 		driver.findElements(By.tagName("frame"));
		 * 
		 * */
		
		
	}
	
	
	
}
