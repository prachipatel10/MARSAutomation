Feature: MARS Login

@First
Scenario: Login with Credentials
Given Launch the browser and enter the URL1
When user enteres login ID1 "prachi" and Password1 "prachi@123" 
Then users click on login button1
 
 @Second
 Scenario: addapplication
 Given mouseover on application from menu
 Then click on list option
 And click on add button
 Then enter name description and version 
 And click on save button
 And click on ok button
 
 @Third
 Scenario: addproject
 Given mouseover on project option 
 Then click on list option of project
 And click on add project button
 Then enter name description and select application
 And click on save button
 And click on ok button 
 
 

