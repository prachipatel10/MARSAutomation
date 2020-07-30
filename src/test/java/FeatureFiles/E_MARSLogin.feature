@addapplicationprojectTS
Feature: MARS Login

Background: Login with Credentials
Given Launch the browser and enter the URL1
When user enteres login ID1 "prachi" and Password1 "prachi@123" 
Then users click on login button1
 
 Scenario: addapplication
 Given login successfully
 And mouseover on application from menu
 Then click on list option
 And click on add button
 Then enter name description version and select extra requirement
 And click on save button
 And click on ok button
 
 
 #Scenario: addproject
 #Given login successfully
 And mouseover on project option 
 Then click on list option of project
 And click on add project button
 Then enter name description and select application
 And click on save button of project
 And click on ok button 
 
 
 #Scenario: addtestsuite
 #Given login successfully
 Then mouseover on test suite option
 And click on list option of test suite
 Then click on add new button of test suite
 And enter name descript select application and select project
 Then click on save button of test suite
 And click on ok button
 
  #Scenario: addtstcase
 #Given login successfully
 Then mouseover on test case option
 And click on list option of test case
 Then click on add new button of test case
 And enter name descript select application and select test suite
 Then click on save button of test case
 And click on ok button
 
 
 
 
 

