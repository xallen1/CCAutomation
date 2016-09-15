$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CCApplicaton.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Test Cadency login scenario",
  "description": "",
  "id": "test-cadency-login-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 20,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-cadency-login-scenario;test-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Open Internet Explorer and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I enter valid username and valid password",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user should be able to log in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.open_Internet_Explorer_and_start_application()"
});
formatter.result({
  "duration": 5047345585,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.i_enter_valid_username_and_valid_password()"
});
formatter.result({
  "duration": 1154789309,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_should_be_able_to_log_in_successfully()"
});
formatter.result({
  "duration": 14271614855,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Test navigation after a user has logged in",
  "description": "",
  "id": "test-cadency-login-scenario;test-navigation-after-a-user-has-logged-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "A user is currently logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I click on a section header",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "the user should be navigated to that page",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.a_user_is_currently_logged_in()"
});
formatter.result({
  "duration": 330728,
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinition.SmokeTest.a_user_is_currently_logged_in(SmokeTest.java:49)\r\n\tat ✽.Given A user is currently logged in(CCApplicaton.feature:31)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SmokeTest.i_click_on_a_section_header()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SmokeTest.the_user_should_be_navigated_to_that_page()"
});
formatter.result({
  "status": "skipped"
});
});