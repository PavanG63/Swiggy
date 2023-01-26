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
@sample2
Feature: Dish
   I want to use this template for dishes

Background:
Given I am on the LoginPage of swiggy
And I locate my location
Then I search for one item
   
   @Set
   Scenario: Search for a dish,Print all names
    #Given I am on the homepage
    #And some other precondition
    #When title of login page is Swiggy
    #And some other action
    #And yet another action
    #Then I search for dish
    When title of the dish is Chicken biryani
    When title of the page is Chicken biryani 
    #And check more outcomes
    #
   @Apt
   Scenario: Add to Cart
    #Given I am on the Login page
    #And some other precondition
    #When title of login page is Swiggy
    #And some other action
    #And yet another action
    Then I choose one restaurant 
    And I select one item
    Then I click on add item
    #And check more outcomes
