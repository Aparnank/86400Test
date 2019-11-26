Feature: Verify 86400 Bank App features
Scenario: Validate details on the OnBoarding Screen
Given I launch the App 
When I check the OnBoarding Screen
And I click the OK Button
Then I should navigate to App Homepage
