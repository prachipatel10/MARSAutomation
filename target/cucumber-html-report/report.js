$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/FeatureFiles/LoginForgetpasswordlogin.feature");
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
      "name": "@Task2"
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
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "forget password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Task3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on forget password link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.click_on_forget_password_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"prachi.patel@convergesolution.com\" email address",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.enter_something_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on request button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.click_on_request_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "open email login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.open_email_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter email address",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.enter_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on signin button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.click_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "open email",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.StepdefinitionLoginforgetpwdlogin.open_email()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});