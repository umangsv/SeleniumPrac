package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyBrokenLinks {

	WebDriver driver;
	
	
	@Test
	public void VerifyLinks()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.manage().deleteAllCookies();
		
		
		// this is how we set the specific browser size using Dimensions Class
		Dimension d = new Dimension(100,200);
		driver.manage().window().setSize(d);
		
		//driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/");
		
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("no of links : " + list.size());
		
		for (WebElement webElement : list) {
			String linkUrl = webElement.getAttribute("href");
			
			checkURL(linkUrl);
			
		}
			
	}
	
	public void checkURL(String linkUrl) {
		
		
	   try {
		   URL url = new URL(linkUrl);
		   
		   HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(1500);
			
			if(httpURLConnect.getResponseCode()==200)
			{
				System.out.println(linkUrl + ":::::::" + httpURLConnect.getResponseMessage());
			}
			
			if(httpURLConnect.getResponseCode() == httpURLConnect.HTTP_NOT_FOUND)
			{
				System.out.println(linkUrl + ":::::::" + httpURLConnect.getResponseMessage() + ":::::::" + httpURLConnect.HTTP_NOT_FOUND);
			}
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		
	}
	
	  
	}
	
	
}
