package app.pages.Android;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import app.base.testBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends testBase {

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]")
	public MobileElement mainLogo;
	
	public HomePage(AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	public void verifyHomePageLogo() {
	
		waitForElementToAppear(mainLogo,60);
		Assert.assertTrue(mainLogo.isDisplayed());
	}
}
