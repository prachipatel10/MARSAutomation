@AddVarKeywordObj
Feature: MARS Login

Background: Login with Credentials
Given Launch the browser and enter the URL1
When user enteres login ID1 "prachi" and Password1 "prachi@123" 
Then users click on login button1

Scenario: addvariable
Given mouseover on variable option
Then click on list of variable option
And click on new variable button
Then enter name value and select type
And click on save button of variable
Then click on ok button

Scenario: add keyword
Given mouseover on keyword option
Then click on list of keyword option
And click on new keyword button
Then enter name and select control type 
And click on save button of keyword
Then click on ok button

Scenario: add object
Given mouseover on object option
Then click on list of object option
And click on insert pegwondow object button
Then enter name select application enter internal access 
And click on insert peg button of insert peg
Then click on ok button 
And click on new object button
Then enter name select object type select application select pegwindow and enter internal access
And click on save button of object
Then click on ok button




