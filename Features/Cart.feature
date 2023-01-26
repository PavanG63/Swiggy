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
@sample3
 Feature: Cart
   I want to use this template for Cart
   
Background:   
Given I am on the LoginPage of app
And I can locate my location
#Then I search for item

   
   @Test
   Scenario: Delete the items in cart
    #Given I am on the Login page
    #And some other precondition
    #When title of login page is Swiggy
    #And some other action
    #And yet another action
    Then I remove the item from cart
    #And again I select a new item
    #Then I click on add to cart
    #And check more outcomes
    #
   @Lib
   Scenario: Update the items in cart
    Given I am on the restaurats page
    #And some other precondition
    #When title of login page is Swiggy
    #And some other action
    #And yet another action
    #Then I go back to restaurats page
    And again I Search for another item
    Then I select one other item 
    And I click on add to cart
