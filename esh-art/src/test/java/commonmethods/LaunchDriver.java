package commonmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchDriver {
	static WebDriver driver;
	public static void getDriverAndLaunchBrowser(String URL,int timeToLaunch)
	{   
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeToLaunch, TimeUnit.SECONDS);
		driver.get(URL);
		
		// javascript executaotr to check that page is fully loaded
		
		JavascriptExecutor je= (JavascriptExecutor)driver;
		for(int i=0;i<50;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Page not loaded completely");
			}
		if(je.executeScript("return document.readyState").toString().equalsIgnoreCase("complete"))
		{
			System.out.println("Page is loaded");
			break;
		}
		else
			System.out.println("Page is not loaded yet");
	
	}}
	
	public void closeBrowser()
	{
		driver.close();
	}

}
