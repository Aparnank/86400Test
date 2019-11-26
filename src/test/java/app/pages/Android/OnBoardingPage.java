package app.pages.Android;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import app.base.testBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class OnBoardingPage extends testBase
{
	@AndroidFindBy(xpath = "//*[contains(@text,'OK')]")
	public MobileElement OkButton;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'It pays to be smart')]")
	public static MobileElement appDialog;

	
	@AndroidFindBy(xpath = "//*[contains(@text,'Open an account')]")
	public static MobileElement dialogTitle ;
	
	
	public OnBoardingPage(AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	public static void verifyAppDialogue() throws InterruptedException {
		
		waitForElementToAppear(appDialog,60);
	
		Assert.assertTrue(appDialog.isDisplayed());
				
	}

	public static void verifyDialogDetails() {
		
		//waitForElementToAppear(dialogTitle,20);
		Assert.assertTrue(dialogTitle.isDisplayed());
		
	}

	public void clickOKButton() throws InterruptedException {
		waitForElementToAppear(OkButton,30);
		Assert.assertTrue(OkButton.isDisplayed());
		 OkButton.click();	
		
	}

	
}