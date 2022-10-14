package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import commonmethods.LaunchDriver;

public class HandlePopups extends LaunchDriver {
	
	private String URL="https://www.spicejet.com/";
	@Test
	void checkWithOptions()
	{
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("disable-popup-blocking");
		
		LaunchDriver.getDriverAndLaunchBrowser(URL,20);
		
		
		
	}

}
