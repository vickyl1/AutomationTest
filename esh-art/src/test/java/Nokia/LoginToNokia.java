package Nokia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToNokia {
    WebDriver driver;
	String nokiaTestURL="https://nokiatest.siteforge.com/jsp/login.jsp#!/login";
	String spiceJet="https://www.spicejet.com/";
	@Test
	public void getWebURL()
	{   
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(nokiaTestURL);
		driver.get(spiceJet);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	
		
		
	}
}
