@Smoke

Feature: Login Functionality 

Scenario Outline: Login with valid credentials 

Given user loads the URL
And user enters the username in "<Username>" field
Then  user enters the password in "<Password>" field
Then user click on the login button
And User navigates to the dashboard of the application

Examples:
|Username|Password|
|mngr650981|pEbedAv|

#I Love Java