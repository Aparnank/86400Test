package app.base;
import java.io.IOException;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

import app.util.commonUtils;
import io.appium.java_client.AppiumDriver;

public class testBase {
	
	public static AppiumDriver driver;
	
	public static String loadPropertyFile = "Android_BankTestApp.properties";
	
	public static void initializedriver() throws IOException
	{
		
    	if(driver==null)
		{
			if(loadPropertyFile.startsWith("Android"))
			{
				commonUtils.loadAndroidConfigProp("Android_BankTestApp.properties");
				commonUtils.setAndroidCapabilities();
				driver= commonUtils.getAndroidDriver();
				
			}
			else if(loadPropertyFile.startsWith("iOS"))
			{
               //code for iOS
			
			}
		}
	}
    	
	
	public static void waitForElementToAppear(WebElement element, int timeout) {
            new WebDriverWait(driver, timeout)
                    .until(ExpectedConditions.visibilityOf(element));
        }
    
			
	
	@AfterSuite
	public void tearDown()
	{
		 driver.quit();
	}

}
