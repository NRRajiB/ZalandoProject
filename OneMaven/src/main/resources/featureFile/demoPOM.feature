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
Feature: Title of your feature
  I want to use this template for my feature file

  @SmokeTest
  Scenario: Title of your scenario
    Given the user opens the url and open login page and click add customer
    When the user fills the text box in home page
    |Raji|NR|raji123@gmail.com|ladies hostel|9095476181|
    Then customer Id is generated and printed
    

  @RegressionTest
  Scenario: Title of your scenario outline
    Given the user opens the url and open login page and click add customer
    When the user fills the text box in home page 
        |Bharani|C|bharani@gmail.com|Anna nagar|8760156060|
    Then customer Id is generated and printed
    
   