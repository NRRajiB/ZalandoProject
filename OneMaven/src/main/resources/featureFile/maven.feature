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
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Searching Redmi Note 7 pro in Amazon 
    Given the customer opens amazon url
    When the customer search "Redmi note 7 pro" in search box
      Then the customer will select any one of the models from the search list
    
    
     @tag2
  Scenario: verifying cart
    Given select two products and add them to cart
    When click add to cart
    Then the list of selected products will be displayed
    
    @tag3
    Scenario: cash on delivery mode checking
    Given go to payment page
    When the customer selecting the cash on delivery option
      Then cash on delivery option will be enabled
      
       @tag4
    Scenario: verifying the function of cancel and reset button
    Given entering the details in the required fields
    When the customer click cancel/reset button to cancel the submit request
      Then the customer entered details are emptied
      And the required fields are emptied
  @tag5
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
