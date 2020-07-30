@saveasmove
Feature: MARS Login

Background: Login with Credentials
Given Launch the browser and enter the URL1
When user enteres login ID1 "prachi" and Password1 "prachi@123" 
Then users click on login button1

Scenario: TestcaseSaveAs
And click on first project
Then click on Test Suite option
And click on any test suite which contain test cases
Then right click on test case
And click on save as test case option
Then remove name description and enter new name description
And click on save button of saveas option
Then click on ok button

#Scenario: storyboardSaveAs
And click on first project
Then click on storyboard option
And right click on storyboard
Then click on saveAs storyboard
And remove name description and enter name description
Then click on save button of storyboard
And click on ok button

#Scenario: testcasemove
And click on first project
Then click on Test Suite option
And click on any test suite which contain test cases
Then right click on test case
And click on move testcase option
Then select testsuite from dropdown to move
And click on save button of move
Then click on ok button







