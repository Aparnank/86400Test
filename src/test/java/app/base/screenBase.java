package app.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import io.appium.java_client.AppiumDriver;

public class screenBase extends testBase {

	public static AppiumDriver driver;
	
	public screenBase(AppiumDriver driver) throws IOException{
		
		this.driver = driver;
		loadElements();		
	}
	
	public void loadElements() throws IOException{
		PageFactory.initElements(driver,this);		
	}
	
	public static void waitForElementToAppear(WebElement element, int timeout) {
            new WebDriverWait(driver, timeout)
                    .until(ExpectedConditions.visibilityOf(element));
        }
    }
