package SeleniumSessions;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCookies {

WebDriver driver;
	
	@Test
	public void login() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		// get Cookies method returns set of cookies
		Set<Cookie> cookies =driver.manage().getCookies();
		
		// no of cookies can be calculated by using size() method
		System.out.println(" no of cookies are : " + cookies.size());
		
		// method to get name and value of cookies
		for (Cookie cookie : cookies) {
			
			System.out.println(cookie.getName() + " : "  + cookie.getValue());
			System.out.println(); 
		}
		
		// get specific cookie value if we have name
		System.out.println("getting the cookie value " + driver.manage().getCookieNamed("session-id-time"));
		
		
		// adding new cookie to the browser
		
		Cookie cObj = new Cookie("mycookie", "1234567890");
		driver.manage().addCookie(cObj);
		
		Set<Cookie> cookies2 = driver.manage().getCookies();
		
		System.out.println(" now lets check the size of cookies after adding a new cookie : " + cookies2.size());
		
		// reprinting all cookies to check if my particular cookie is added 
		for (Cookie cookie : cookies2) {
			System.out.println(cookie.getName() + "  :  "  + cookie.getValue());
			System.out.println();
		}
		
		
		// deleting the cookies
		
		driver.manage().deleteCookie(cObj); // deleting a particular cookie
		
		Set<Cookie> cookies3 = driver.manage().getCookies();
		System.out.println(" now lets check again the size of cookies : " + cookies3.size());
		
		
		driver.manage().deleteAllCookies(); // deleting all cookies
		
		Set<Cookie> cookies4 = driver.manage().getCookies();
		System.out.println(" deleting all the cookies : " + cookies4.size());
		
		driver.quit();
		
	}
}
