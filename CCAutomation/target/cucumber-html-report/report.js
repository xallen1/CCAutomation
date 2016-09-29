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
  "line": 20,
  "name": "Cadency Smoke test for demo",
  "description": "",
  "id": "cadency-smoke-test-for-demo",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 22,
  "name": "Pull up Certification Aging Details for Reconciling Items",
  "description": "",
  "id": "cadency-smoke-test-for-demo;pull-up-certification-aging-details-for-reconciling-items",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "Open Internet Explorer and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I am on the R2R page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I click on Total under Reconciling Items",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "A pop up breakdown of the total and aging details should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.open_Internet_Explorer_and_start_application()"
});
formatter.result({
  "duration": 3577709623,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    }
  ],
  "location": "SmokeTest.i_am_on_the_R_R_page(int)"
});
formatter.result({
  "duration": 8311138589,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.i_click_on_Total_under_Reconciling_Items()"
});
formatter.result({
  "duration": 1614059621,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.a_pop_up_breakdown_of_the_total_and_aging_details_should_appear()"
});
formatter.result({
  "duration": 4994054159,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Pull up Certification Unreconciled Balances",
  "description": "",
  "id": "cadency-smoke-test-for-demo;pull-up-certification-unreconciled-balances",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "Open Internet Explorer and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I am on the R2R page",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I click on Unreconciled Balances amount displayed",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "A pop up breakdown of the unreconciled balances should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.open_Internet_Explorer_and_start_application()"
});
formatter.result({
  "duration": 2910917032,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    }
  ],
  "location": "SmokeTest.i_am_on_the_R_R_page(int)"
});
formatter.result({
  "duration": 7019748609,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.i_click_on_Unreconciled_Balances_amount_displayed()"
});
formatter.result({
  "duration": 3307973137,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.a_pop_up_breakdown_of_the_unreconciled_balances_should_appear()"
});
formatter.result({
  "duration": 4326179314,
  "status": "passed"
});
});