package esh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class LoginToPage {
	WebDriver driver;
	@Test(priority = 1)
	public void loginPageToATT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    ChromeDriver  driver= new ChromeDriver();
		
        //maximize browser window
        driver.manage().window().maximize();
       // implicit wait
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        String url="https://dev-att.siteforge.com/att/workorder-management";
        driver.get(url);
         WebElement submit= driver.findElement(By.id("submit"));
        submit.sendKeys("");
	}
/*
	@AfterTest()
	public void closeDriver()
	{  
		driver. manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.quit();
		
	}
*/
}
