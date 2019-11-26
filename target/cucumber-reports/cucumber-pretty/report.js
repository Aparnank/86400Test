$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onBoardingScreen.feature");
formatter.feature({
  "line": 1,
  "name": "Verify 86400 Bank App features",
  "description": "",
  "id": "verify-86400-bank-app-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate details on the OnBoarding Screen",
  "description": "",
  "id": "verify-86400-bank-app-features;validate-details-on-the-onboarding-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I launch the App",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I check the OnBoarding Screen",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I click the OK Button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I should navigate to App Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "onBoardingSteps.i_launch_the_App()"
});
formatter.result({
  "duration": 20238544069,
  "status": "passed"
});
formatter.match({
  "location": "onBoardingSteps.i_check_OnBoarding_Screen()"
});
formatter.result({
  "duration": 28336561356,
  "status": "passed"
});
formatter.match({
  "location": "onBoardingSteps.i_click_the_OK_Button()"
});
formatter.result({
  "duration": 1540128447,
  "status": "passed"
});
formatter.match({
  "location": "onBoardingSteps.i_should_navigate_to_App_Homepage()"
});
formatter.result({
  "duration": 2261660262,
  "status": "passed"
});
});