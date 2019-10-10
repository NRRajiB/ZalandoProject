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
@Feature
Feature: Title of your feature
  I want to use this template for my feature file

 
  @SmokeTest
  Scenario: Generate customer ID
    Given launch the browser 
    And open the url 
    And click add customer
    When the user navigates to home page and fill the text boxes and submit 
      | FirstName  |Raji|  
      |LastName    |NR|
      |Email| raji123@gmail.com| 
      | Address|ladies hostel| 
      |Mob number|8760156060|      
    Then the user get the customer ID

  @RegressionTest
  Scenario: Generate customer ID
    Given launch the browser 
    And open the url 
    And click add customer
    When the user navigates to home page and fill the text boxes and submit 
      | FirstName  |Bharani|  
      |LastName    |c|
      |Email| bhrani@gmail.com| 
      | Address|Anna nagar| 
      |Mob number|9095476181|      
    Then the user get the customer ID
    
    
    @RegressionTest
  Scenario: Generate customer ID
    Given launch the browser 
    And open the url 
    And click add customer
    When the user navigates to home page and fill the text boxes and submit 
      | FirstName  |uva|  
      |LastName    |G|
      |Email| uva@gmail.com| 
      | Address|Murugan street| 
      |Mob number|605236718|      
    Then the user get the customer ID

@SmokeTest
  Scenario: Generate customer ID
    Given launch the browser 
    And open the url 
    And click add customer
    When the user navigates to home page and fill the text boxes and submit 
      | FirstName  |sasi|  
      |LastName    |G|
      |Email| sasi@gmail.com| 
      | Address|Murugan street| 
      |Mob number|624396565|      
    Then the user get the customer ID    
  