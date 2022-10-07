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
		LaunchDriver.getDriverAndLaunchBrowser(URL,20);
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("disable-popup-blocking");
		
	}

}
