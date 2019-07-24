Feature: login and perform purchase
Here user should be able to login with valid email and username; And user should perform purchase

@End2end
Scenario: This scenario should always run
Given Initilize driver from Base class
When Initilize page objects from pageFactory package
Then Initilize screenshot method from Base class

@End2end
Scenario: User logs in successfully
Given User opens the page and clicks signin
When User enters email and password in signin page
Then My account page opens

