package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		WebDriver driver; // = new WebDriver();   cannot instantiate the WebDriver Interface
		
		System.setProperty("webdriver.chrome.driver", "/Users/umang/Desktop/Executables/chromedriver");
		driver = new ChromeDriver(); // session id will be created at this point. Selenium will interact with browser using this session ID
		
		// every request using driver, Session ID will be used. 
		
		driver.get("https://www.google.com");
		
		driver.quit(); // close the browser Session ID is null and an Exception will be thrown - NoSuchSessionException
		
		driver.close(); // if close is used, we will get Invalid/Expired session id while fetching title using driver 
		
		// Exception 
		
		driver.getTitle();  // 
		 
		
	}

}
