@projectleftpanel
Feature: MARS Login

Background: Login with Credentials
Given Launch the browser and enter the URL1
When user enteres login ID1 "prachi" and Password1 "prachi@123" 
Then users click on login button1

Scenario: add project in left panel
Given click on setting icon
Then click on project display list option
And click on checkbox
Then click on save button of display project list
And click on ok button 
