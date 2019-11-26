package app.StepDefinitions;
import app.base.testBase;
import app.pages.Android.HomePage;
import app.pages.Android.OnBoardingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class onBoardingSteps extends testBase {
	
	OnBoardingPage onboardingpage;
	HomePage homepage;
	
	@Given("^I launch the App$")
	public void i_launch_the_App() throws Throwable {
	    testBase.initializedriver();
	   
	}

	@When("^I check the OnBoarding Screen$")
	public void i_check_OnBoarding_Screen() throws Throwable {
	   onboardingpage = new OnBoardingPage(driver);
		onboardingpage.verifyAppDialogue();
	    
	}

	@And("^I click the OK Button$")
	public void i_click_the_OK_Button() throws Throwable {
		onboardingpage.clickOKButton();
	   
	}

	@Then("^I should navigate to App Homepage$")
	public void i_should_navigate_to_App_Homepage() throws Throwable {
		homepage =new HomePage(driver);
		homepage.verifyHomePageLogo();
	   
	}


}
