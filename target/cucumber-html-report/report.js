$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/FeatureFiles/MARSLogin.feature");
formatter.feature({
  "name": "MARS Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
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
formatter.scenario({
  "name": "addapplication",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Second"
    }
  ]
});
formatter.step({
  "name": "mouseover on application from menu",
  "keyword": "Given "
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
  "name": "enter name description and version",
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
formatter.scenario({
  "name": "addproject",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Third"
    }
  ]
});
formatter.step({
  "name": "mouseover on project option",
  "keyword": "Given "
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
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d83.0.4103.116)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027CS-DC-09\u0027, ip: \u0027192.168.0.30\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\CS-DC-09\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:57303}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 7f2065ed8c914eab2a86dd8630ce5671\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat mars.ConvergesolAutomation.MarsBase.Sendkey(MarsBase.java:60)\r\n\tat StepDefinition.StepdefinitionAddAppPrjTSTCDS.enter_name_something_description_something_and_select_application(StepdefinitionAddAppPrjTSTCDS.java:75)\r\n\tat ✽.enter name description and select application(file:///C:/ConvergesolAutomation/src/test/java/FeatureFiles/MARSLogin.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionAddAppPrjTSTCDS.click_on_save_button()"
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
formatter.after({
  "status": "passed"
});
});