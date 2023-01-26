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
@sample
Feature: Location
  I want to use this template for my Location
 
Background:
Given I am on the LoginPage
And I click on locate my location

  @smoke
  Scenario: Set the Location
    #Given I am on the LoginPage
    #And some other precondition
    #When title of login page is Swiggy
    #And some other action
    #And yet another action
    Then I set my location
    #And check more outcomes

  @valid
  Scenario: Update the Location
    #And I want to change the location
    #When I Click on any item
    Then I change the location
    #Then I click on checkout
    

