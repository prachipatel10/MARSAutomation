Feature: MARS Login

@Task2
Scenario: Login with Credentials
Given Launch the browser and enter the URL1
When user enteres login ID1 "prachi" and Password1 "prachi@123" 
Then users click on login button1

@Task3
Scenario: forget password
Given browser is open
And click on forget password link
Then enter "prachi.patel@convergesolution.com" email address
And click on request button
Then open email login page 
When enter email address
Then enter password
And click on signin button
Then open email
