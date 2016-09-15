#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Test Cadency login scenario

@tag1
Scenario: Test login with valid credentials
Given Open Internet Explorer and start application
When I enter valid username and valid password
Then user should be able to log in successfully

@tag1
Scenario: Test navigation after a user has logged in
Given A user is currently logged in
When I click on a section header
Then the user should be navigated to that page

