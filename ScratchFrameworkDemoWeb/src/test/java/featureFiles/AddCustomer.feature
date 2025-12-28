@Regression

Feature: User is Adding a customer 


Background:
 Given user is logged into Guru99 application

Scenario: user is adding new customer 
Given user clicked on New Customer link
Then user filled up the form with all details 

|CustomerName|DateOfBirth|Address|City|State|PIN|telephoneNumber|Email|
|ShbubhajyotiBanerjee|23081995|kolkata|kolkata|wb|123456|98887567876|test@test.com|


And user clicked on the submit button 

