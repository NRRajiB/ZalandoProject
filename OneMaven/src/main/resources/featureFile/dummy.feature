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
@Feature1
Feature: Title of your feature
  I want to use this template for my feature file

  @SmokeTest
  Scenario: Login_page
    Given Launch the browser and open the url
    When Enter the username, password and click
    |Raji|271294|
    Then Navigate to home page
    
    
  @SmokeTest
  Scenario: Login_page
    Given Launch the browser and open the url
    When Enter the username, password and click
    |Sasi|201523|
    Then Navigate to home page
   

  @RegressionTest
  Scenario Outline: Title of your scenario outline
    Given Launch the browser and open the url
    When Enter the username, password and click "<Username>","<password>"
    Then Navigate to home page
    Examples: 
      | Username  | password|
      | Bharani |271294|
      | uva| 27712|
