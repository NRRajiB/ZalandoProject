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
@Feature3
Feature: Customer_ID Generation
  I want to use this template for my feature file

  @SmokeTest
  Scenario: Generate_Customer ID_1 for one customer
   Given open the url and click add customer
    When the user navigates to home page and fill the text boxes and submit 
    |Raji    | NR | raji@gmail.com| ladies hostel| 8760156060|
    Then the user get the customer ID
 
  
   @RegressionTest
  Scenario: Generate_customer ID_2 for two customer
    Given open the url and click add customer
    When the user navigates to home page and fill the text boxes and submit 
     | Bharani   |  C   | bharani@gmail.com | AnnaNagar|9095476781|
    Then the user get the customer ID
