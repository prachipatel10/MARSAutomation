@TestSuite
Feature: Mars TestSuite

Scenario: Login with Credentials
Given Launch the browser and enter the URL1
When user enteres login ID1 "prachi" and Password1 "prachi@123" 
Then users click on login button1
And mouseover on application from menu
Then click on list option
And click on add button
Then enter name description version and select extra requirement
And click on save button
And click on ok button
And mouseover on project option 
Then click on list option of project
And click on add project button
Then enter name description and select application
And click on save button of project
And click on ok button 
Then mouseover on test suite option
And click on list option of test suite
Then click on add new button of test suite
And enter name descript select application for test suite
And select project
Then click on save button of test suite
And click on ok button
Then mouseover on test case option
And click on list option of test case
Then click on add new button of test case
And enter name descript select application 
And select test suite
Then click on save button of test case
And click on ok button
And click on setting icon
Then click on project display list option
And click on checkbox
Then click on save button of display project list
And click on ok button 
#add storyboard code
Then click on new added project
And rightclick on storyboard
Then click on add storyboard
And enter name and description
Then click on save button of add storyboard
And click on ok button
#TestcaseSaveAs
Then click on new added project for saveAs TS
Then click on Test Suite option
And click on any test suite which contain test cases
Then right click on test case
And click on save as test case option
Then remove name description and enter new name description
And click on save button of saveas option
Then click on ok button
#Scenario: storyboardSaveAs
And click on new added project for saveAs storyboard
Then click on storyboard option
And right click on storyboard
Then click on saveAs storyboard
And remove name description and enter name description
Then click on save button of storyboard
And click on ok button
#Scenario: testcasemove
#And click on first project
#Then click on Test Suite option
#And click on any test suite which contain test cases
#Then right click on test case
And click on move testcase option
Then select testsuite from dropdown to move
And click on save button of move
Then click on ok button
#addvariable
And mouseover on variable option
Then click on list of variable option
And click on new variable button
Then enter name value and select type
And click on save button of variable
Then click on ok button
#add keyword
And mouseover on keyword option
Then click on list of keyword option
And click on new keyword button
Then enter name and select control type 
And click on save button of keyword
Then click on ok button
#add object
And mouseover on object option
Then click on list of object option
And click on insert pegwondow object button
Then enter name select application enter internal access 
And click on insert peg button of insert peg
Then click on ok button 
And click on new object button
Then enter name select object type select application select pegwindow and enter internal access
And click on save button of object
Then click on ok button
#add signout code
Then click on usename for signout
And click on signout option
#forget password
And click on forget password link
Then enter "prachi.patel@convergesolution.com" email address
And click on request button
Then open email login page 
When enter email address
Then enter password
And click on signin button
Then open email
And click on reset password link
Then enter password "prachi@123" and confirm password "prachi@123"
And click on reset button and click on ok button
Then user enters login ID2 "prachi" and Password2 "prachi@123" 
And users click on login button2
 
 
 
 

