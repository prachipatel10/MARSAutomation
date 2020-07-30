$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/FeatureFiles/MarsTestSuite.feature");
formatter.feature({
  "name": "Mars TestSuite",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TestSuite"
    }
  ]
});
formatter.scenario({
  "name": "Login with Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestSuite"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the browser and enter the URL1",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLogin.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enteres login ID1 \"prachi\" and Password1 \"prachi@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLogin.user_enteres_login_id1_something_and_password1_something(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users click on login button1",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLogin.users_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mouseover on application from menu",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.mouseover_on_application_from_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on list option",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_list_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on add button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter name description version and select extra requirement",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.enter_name_somethingdescription_something_and_version_something()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on ok button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_ok_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mouseover on project option",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.mouseover_on_project_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on list option of project",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_list_option_of_project()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on add project button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_add_project_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter name description and select application",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.enter_name_something_description_something_and_select_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on save button of project",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_save_button_of_project()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on ok button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_ok_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mouseover on test suite option",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.mouseover_on_test_suite_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on list option of test suite",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_list_option_of_test_suite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on add new button of test suite",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_add_new_button_of_test_suite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter name descript select application for test suite",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.enter_name_descript_select_application_and_select_project()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#testsuitename\"}\n  (Session info: chrome\u003d84.0.4147.89)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027CS-DC-09\u0027, ip: \u0027192.168.0.30\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.89, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\CS-DC-09\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:62053}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 4188835bad1c671ee839d1e1adfc0138\n*** Element info: {Using\u003did, value\u003dtestsuitename}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat PageObjects.AddAppPrjTSTCDS.entertestsuitename(AddAppPrjTSTCDS.java:149)\r\n\tat StepDefinition.StepdefinitionAddAppPrjTSTCDS.enter_name_descript_select_application_and_select_project(StepdefinitionAddAppPrjTSTCDS.java:193)\r\n\tat ✽.enter name descript select application for test suite(file:///C:/ConvergesolAutomation/src/test/java/FeatureFiles/MarsTestSuite.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "select project",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.select_project()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on save button of test suite",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_save_button_of_test_suite()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on ok button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "mouseover on test case option",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.mouseover_on_test_case_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on list option of test case",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_list_option_of_test_case()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on add new button of test case",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_add_new_button_of_test_case()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter name descript select application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.enter_name_descript_select_application_and_select_test_suite()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select test suite",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.select_test_suite()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on save button of test case",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_save_button_of_test_case()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on ok button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on setting icon",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddprojectinleftpanel.click_on_setting_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on project display list option",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddprojectinleftpanel.click_on_project_displat_list_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddprojectinleftpanel.click_on_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on save button of display project list",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddprojectinleftpanel.click_on_create_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on ok button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on new added project",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionSaveAsMove.click_on_new_added_project()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "rightclick on storyboard",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on add storyboard",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "enter name and description",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on save button of add storyboard",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on ok button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on new added project for saveAs TS",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on Test Suite option",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on any test suite which contain test cases",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "right click on test case",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on save as test case option",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "remove name description and enter new name description",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on save button of saveas option",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on ok button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on new added project for saveAs storyboard",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on storyboard option",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "right click on storyboard",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on saveAs storyboard",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "remove name description and enter name description",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on save button of storyboard",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on ok button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on move testcase option",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select testsuite from dropdown to move",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on save button of move",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on ok button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "mouseover on variable option",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.mouseover_on_variable_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on list of variable option",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.click_on_list_of_variable_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on new variable button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.click_on_new_variable_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter name value and select type",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.enter_name_value_and_select_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on save button of variable",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.click_on_save_button_of_variable()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on ok button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "mouseover on keyword option",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.mouseover_on_keyword_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on list of keyword option",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.click_on_list_of_keyword_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on new keyword button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.click_on_new_keyword_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter name and select control type",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.enter_name_and_select_control_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on save button of keyword",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.click_on_save_button_of_keyword()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on ok button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "mouseover on object option",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.mouseover_on_object_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on list of object option",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.click_on_list_of_object_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on insert pegwondow object button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "enter name select application enter internal access",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on insert peg button of insert peg",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on ok button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on new object button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "enter name select object type select application select pegwindow and enter internal access",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on save button of object",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on ok button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on usename for signout",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.click_on_usename_for_signout()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on signout option",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddVarkeywobj.click_on_signout_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on forget password link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.click_on_forget_password_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter \"prachi.patel@convergesolution.com\" email address",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.enter_something_email_address(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on request button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.click_on_request_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "open email login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.open_email_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter email address",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.enter_email_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter password",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.enter_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on signin button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.click_on_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "open email",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.open_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on reset password link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.click_on_reset_password_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter password \"prachi@123\" and confirm password \"prachi@123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.enter_password_something_and_confirm_password_something(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on reset button and click on ok button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.click_on_reset_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters login ID2 \"prachi\" and Password2 \"prachi@123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.user_enters_login_id2_something_and_password2_something(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "users click on login button2",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.users_click_on_login_button1()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});